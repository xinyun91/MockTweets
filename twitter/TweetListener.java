package twitter;

import java.util.ArrayList;

public interface TweetListener {

    public void tweetsReceived(ArrayList<Tweet> tweets);
    
}
