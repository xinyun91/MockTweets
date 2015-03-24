package mockTweets.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import mockTweets.model.DataModel;

public class SimpleGUI implements Runnable {

    private DataModel _model;
    private JFrame _window;
    private JTextArea _textArea;
    private JTextField _textField;
    private JTextField _textField1;
    private JPanel _letterFrequencyPanel;
    private ArrayList<JLabel> _counts;
    private JPanel _topWordPanel;
    private ArrayList<JLabel> _words;
    
    public SimpleGUI(DataModel dataModel) {
        _model = dataModel;
        _model.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent e) {
                SimpleGUI.this.update();
            }
        });
    }

    @Override public void run() {
        _window = new JFrame("Twitter Visualization");
        _window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = _window.getContentPane();
        
        cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(0,1,2,2));
        
        JPanel p3A = new JPanel();
        p3A.setLayout(new BoxLayout(p3A, BoxLayout.X_AXIS));//new GridLayout(0,1));
        
        JPanel p3B = new JPanel();
        p3B.setLayout(new BoxLayout(p3B, BoxLayout.X_AXIS));//new GridLayout(0,1));
        
        JPanel p3C = new JPanel();
        p3C.setLayout(new BoxLayout(p3C, BoxLayout.X_AXIS));//new GridLayout(0,1));
        
        _textField = new JTextField("#Buffalo", 20);
        JButton setAndSendQuery = new JButton("query");
        setAndSendQuery.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) {
                _model.setQuery(_textField.getText());
                _model.runQuery();
            }
        });
        p1.add(_textField);
        p1.add(setAndSendQuery);
        
        _textArea = new JTextArea();
        p2.add(_textArea);
        
        JLabel averageTweetLength = new JLabel("Average Tweet length: ");
        _textField1 = new JTextField(20);
        _textField1.setEditable(false);
        _textField1.setFont(new Font("Courier",Font.BOLD,48));
        p3A.add(averageTweetLength);
        p3A.add(_textField1);
        
        JLabel letterFrequencies = new JLabel("Letter frequencies: ");
        _letterFrequencyPanel = new JPanel();
        _letterFrequencyPanel.setLayout(new GridLayout(2,26,4,2));
        p3B.add(letterFrequencies);
        p3B.add(_letterFrequencyPanel);
        
        for (int i=0; i<26; i=i+1) {
            JLabel label = new JLabel(""+((char)('a'+i)));
            label.setBackground(new java.awt.Color(255-10*i,128,10*i));
            label.setOpaque(true);
            label.setFont(new Font("Courier",Font.BOLD,24));
            label.setForeground(new java.awt.Color(128,255,128));
            _letterFrequencyPanel.add(label);
        }
        _counts = new ArrayList<JLabel>();
        for (int i=0; i<26; i=i+1) {
            JLabel label = new JLabel("_");
            label.setBackground(new java.awt.Color(255-10*i,128,10*i));
            label.setOpaque(true);
            label.setFont(new Font("Courier",Font.BOLD,24));
            label.setForeground(new java.awt.Color(128,255,128));
            _counts.add(i,label);
            _letterFrequencyPanel.add(_counts.get(i));
        }

        JLabel topWords = new JLabel("Most frequent words: ");
        _topWordPanel = new JPanel();
        _topWordPanel.setLayout(new GridLayout(0,5,4,2));
        p3C.add(topWords);
        p3C.add(_topWordPanel);
        
        _words = new ArrayList<JLabel>();
        for (int i=0; i<5; i=i+1) {
            JLabel label = new JLabel("_");
            label.setBackground(new java.awt.Color(255-50*i,128,50*i));
            label.setOpaque(true);
            label.setFont(new Font("Courier",Font.BOLD,24));
            label.setForeground(new java.awt.Color(128,255,128));
            _words.add(i,label);
            _topWordPanel.add(_words.get(i));
        }

        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        p3.add(p3A);
        p3.add(p3B);
        p3.add(p3C);
        _window.pack();
        _window.setVisible(true);        
    }
    
    private void updateCounts(HashMap<Character,Integer> counts) {
        for (char ch='a'; ch <= 'z'; ch++) {
            _counts.get(ch-'a').setText(""+counts.get(ch));
        }
    }

    private void updateWords(HashMap<String,Integer> counts) {
        ArrayList<Entry<String,Integer>> entries = new ArrayList<Entry<String,Integer>>(counts.entrySet());
        Collections.sort(entries, new Comparator<Entry<String,Integer>>() {
            @Override public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return (int) Math.signum(o2.getValue() - o1.getValue());
            }
        });
        int totalCount = 0;
        for (int i=0; i<5; i=i+1) {
            Entry<String,Integer> entry = entries.get(i);
            totalCount = totalCount + entry.getValue();
        }
        for (int i=0; i<5; i=i+1) {
            Entry<String,Integer> entry = entries.get(i);
            _words.get(i).setText(entry.getKey()+" ("+entry.getValue()+")");
            int fontSize = entry.getValue() * 84 / totalCount; 
            _words.get(i).setFont(new Font("Courier", Font.BOLD, fontSize));
        }
    }

    public void update() {
        _textArea.setText(_model.toString());
        _textField1.setText(String.format("%.2f",_model.getAverageTweetLength()));
        updateCounts(_model.getCharacterCounts());
        updateWords(_model.getWordCounts());
        _window.revalidate();
        _window.pack();
    }
        
}

