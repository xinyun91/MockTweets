package twitter;

import twitter4j.Status;

public class Tweet {

    private String _n;
    private String _sn;
    private String _t;
    
    public Tweet(String name, String screenName, String text) {
        _n = name;
        _sn = screenName;
        _t = text;
    }
    
    public Tweet(Status s) {
        _n = s.getUser().getName();
        _sn = s.getUser().getScreenName();
        _t = s.getText();
    }
    
    public String getName(){ return _n; }
    public String getScreenName(){ return _sn;  }
    public String getText(){ return _t; }
    
    @Override public String toString() {
        return "list.add(new Tweet(\""+getName()+"\",\""+getScreenName()+"\",\""+getText()+"\"));";
    }

}
