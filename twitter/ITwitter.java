package twitter;

import java.util.ArrayList;

public interface ITwitter {

    void setQuery(String _query);

    ArrayList<Tweet> runQuery();

}
