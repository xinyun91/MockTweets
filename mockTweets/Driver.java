package MockTweets;

import javax.swing.SwingUtilities;

import MockTweets.gui.SimpleGUI;

public class Driver {

    public static void main(String[] args) {
        /*
         * DECIDE WHETHER YOU WANT TO USE THE MOCK TWITTER OBJECT OR THE REAL TWITTER OBJECT
         */

        boolean USE_MOCK_TWITTER_OBJECT = true;

        lab7.model.DataModel dataModel;
        if (USE_MOCK_TWITTER_OBJECT) {
            dataModel = new MockTweets.model.DataModel();
            /*
             * Available queries:
             *         #Buffalo
             *         #Toronto
             *         #Ottawa
             *         #London
             *         #Perth
             *         #Christchurch
             */
        }
        else {
            String consumerKey = "FlQDs1ghgkPwfDOOoszftMAcK";
            String consumerSecret = "iIhTyBzsXiUkM2uuUoVkZ8eU2dmHqhJ5alyJjT28toodkrSjbn";
            String accessToken = "1279523622-VIvWzOma0mZdKtP7ZMxfG5Uikfg9q071iDv6JPa";
            String accessTokenSecret = "vG29f5EAFqfEw2QZ3kQQv1lzz21m6BLgPTZTth8ahIvrZ";
            dataModel = new MockTweets.model.DataModel(consumerKey, consumerSecret, accessToken, accessTokenSecret);
        }
        SwingUtilities.invokeLater(new SimpleGUI(dataModel));
    }

}
