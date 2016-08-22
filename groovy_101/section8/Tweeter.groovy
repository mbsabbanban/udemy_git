import groovy.transform.*

@ToString()
class Tweeter {
    
    String username
    String content
    String location
    Date createdAt = new Date()
    Integer likes = 0
    Integer retweets = 0

    def likeTweet(){
        likes++
    }

    def retweet(){
        retweets++
    }
    
    //Guess I also need to include the constructor in the class
    
    public Tweeter(String user, String tweet, String place){
        
        username=user
        content=tweet
        location=place
	createdAt
	likes
	retweets
        
    }
    
}

/*
Tweet twt = new Tweet('@sabbanban','Sho is demon child','Bayside,NY',new Date())

print twt
*/
