import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello," + name + "Lovely to see you.";
    // return String.format("Hello, %s. Lovely to see you.", name) ;
    }

    public String guestGreeting(String name, String dayperiod) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you, day period is %s", name, dayperiod);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently"+ date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis")> -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred")> -1) {
            return "At your service. As you wish, naturally.";
            
        }
        return "Right. And with that I shall retire.";
        // return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}