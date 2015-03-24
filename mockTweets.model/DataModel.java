package mockTweets.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import twitter.ITwitter;
import twitter.MockTwitter;
import twitter.Tweet;
import twitter.Twitter;

public class DataModel {

    private ArrayList<ChangeListener> _listeners;
    private ArrayList<Tweet> _tweets;
    private ITwitter _twitter;
    private String _query;

    public DataModel(String consumerKey, String consumerSecret,
            String accessToken, String accessTokenSecret) {
        _twitter = new Twitter(consumerKey, consumerSecret, accessToken,
                accessTokenSecret);
        _tweets = new ArrayList<Tweet>();
        _listeners = new ArrayList<ChangeListener>();
    }

    public DataModel() {
        _twitter = new MockTwitter();
        _tweets = new ArrayList<Tweet>();
        _listeners = new ArrayList<ChangeListener>();
    }

    public void setQuery(String text) {
        _query = text;
    }

    public void runQuery() {
        _twitter.setQuery(_query);
        _tweets = _twitter.runQuery();
        fireStateChanged();
    }

    @Override
    public String toString() {
        String s = "";
        for (Tweet t : _tweets) {
            s = s + t.getText() + "\n";
        }
        return s;
    }

    public void addChangeListener(ChangeListener cl) {
        _listeners.add(cl);
    }

    public void removeChangeListener(ChangeListener cl) {
        _listeners.remove(cl);
    }

    public void fireStateChanged() {
        for (ChangeListener cl : _listeners) {
            cl.stateChanged(new ChangeEvent(_query));
        }
    }

    /**
     * Define this method so that it computes the average length (in characters)
     * of the text String of all the Tweets in _tweets
     * 
     * @return the average tweet length
     */
    public double getAverageTweetLength() {
        double total = 0.0;
        for (Tweet t : _tweets) {
            double l = t.getText().length();
            total = l + total;
        }
        
        double avg = total / _tweets.size();
        return avg;
    }

    /**
     * Put the counts of all characters contained in the text String of all the
     * Tweets in _tweets into a HashMap<Character,Integer>
     * 
     * @return the map of character counts
     */
    public HashMap<Character, Integer> getCharacterCounts() {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Tweet t : _tweets) {
            int value;
            String s = t.getText().toLowerCase();
            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    value = map.get(c);
                    map.put(c, ++value);
                } else {
                    value = 1;
                    map.put(c, value);
                }
            }
        }
        return map;
    }

    /**
     * Put the counts of all words contained in the text String of all the
     * Tweets in _tweets into a HashMap<String,Integer>
     * 
     * @return the map of word counts
     */
    public HashMap<String, Integer> getWordCounts() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Tweet t : _tweets) {
            int value;
            String s = t.getText().toLowerCase();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (map.containsKey(word)) {
                    value = map.get(word);
                    map.put(word, ++value);
                } else {
                    value = 1;
                    map.put(word, value);
                }
            }
        }
        return map;
    }

}
