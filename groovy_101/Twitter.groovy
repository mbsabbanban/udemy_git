// create a new instance of Tweet
Tweet twt = new Tweet()
    
twt.userName = "@sabbanban"
twt.content = "My first tweet!"
twt.hitDate = new Date()
twt.location = "Bayside, NY"

// assign some tweets
twt.oldTweets << "$twt.content"

// Calling a method that tweets out to the world
//twt.tweet()
 
// Make another tweet
 
twt.content = "This is my second tweet. Better listen up fools!"
 
twt.oldTweets << "$twt.content"

// Calling a method that tweets out to the world
twt.tweet()

// Checking old tweets array
twt.oldTweets

// Final method to call entire history
// twt.tweetHistory() Would like to fix this method in the future