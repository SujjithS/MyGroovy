@groovy.transform.ToString()
class Tweet{
    String Username //Sujjith
    String text
    Integer retweets
    Integer favorites
    Date CreatedOn

    public Tweet(String User, String tweet)    //Constructor- way to create new tweets
    {
    username=User
    text=tweet
    retweets=0
    favorites=0
    CreatedOn=new Date()
    }
    void addtoRetweets(){
    retweets+=1
    }
    void addtoFavorites(){
    favorites+=1
    }
}
def tweet=new Tweet("Sujith","Hey you! How ya doing")   //this only works when the file name is not Tweet.groovy
println tweet