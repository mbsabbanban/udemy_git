// create a new instance of Tweet
Tweet twt = new Tweet("sabbanban", "My first tweet!")
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
twt.tweetHistory() // Method was fixed using a closure