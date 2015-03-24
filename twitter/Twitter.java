package twitter;

import java.util.ArrayList;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Twitter implements ITwitter {

    private twitter4j.Twitter _twitter;
    private String _searchString;

    public Twitter(String consumerKey, String consumerSecret,
            String accessToken, String accessTokenSecret) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthAccessToken(accessToken)
        .setOAuthAccessTokenSecret(accessTokenSecret)
        .setOAuthConsumerKey(consumerKey)
        .setOAuthConsumerSecret(consumerSecret);

        TwitterFactory tf = new TwitterFactory(cb.build());
        _twitter = tf.getInstance();
    }

    @Override
    public void setQuery(String s) {
        _searchString = s;
    }

    @Override
    public ArrayList<Tweet> runQuery() {
        ArrayList<Tweet> _tweets = new ArrayList<>();
        QueryResult qr = null;
        try {
            qr = _twitter.search(new Query(_searchString));
        }
        catch (TwitterException e) {
            e.printStackTrace();    
            return _tweets;
        }
        for(Status s : qr.getTweets()){
            _tweets.add(new Tweet(s));
        }
        return _tweets;
    }
    
}
