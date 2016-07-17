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
    Date hitDate
    String location
    
    def oldTweets = []

    void tweet(){
        println "$userName said '$content' from $location"
    }

    void tweetHistory(){
        oldTweets.each{println oldTweet}
    }
}