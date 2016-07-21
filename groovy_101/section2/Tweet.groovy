import groovy.transform.ToString

/**
 * Udemy Groovy 101 - Exercise 26: Creating my own Class
 * Created by Matt on 7/17/2016.
 */

@ToString()
class Tweet {

    //Define some properties first
    String userName
    String content
    Integer retweets
    Integer favorites
    Date hitDate
    String location
    
    def oldTweets = []
    
    public Tweet(String user, String tweet){
        userName = user
        content = tweet
        retweets = 0
        favorites = 0
        hitDate = new Date()
    }

    void tweet(){
        println "$userName said '$content' from $location"
    }

    void tweetHistory(){
    	oldTweets.each { println it }
    }
    
    // adding a method to the class so that it increments retweets
    void addToRetweets(){
        retweets += 1
    }
    
    // adding a method to the class so that it increments favorites
    void addToFavorites(){
        favorites += 1
    }
}

// Tweet twit = new Tweet()
