import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
	 Scanner in = new Scanner(System.in);
	       String eventType= new String();
	       String result= new String();
	       
	 int partySize;
	 
	        System.out.println("Please enter the event type ");
	        eventType = in.nextLine(); 
	        
	        System.out.println("Please enter party size ");
	        partySize = in.nextInt(); 
	        
	        result = "The event type is " + eventType + " and the party size is " + partySize;
	        result=result + ". The meal suggestion is ";
	        
	        if(eventType.equals("casual"))
	            result = result + "sandwiches";
	        
	        else if(eventType.equals("semi-formal"))
	            result = result + "fried chicken";
	        
	        else if(eventType.equals("formal"))
	            result = result + "chicken parmesan";
	        
	        result = result + ". The preparation suggestion is ";
	        
	        if(partySize==1)
	            result = result + "in the microwave";
	        
	        else if(partySize>=2&&partySize<=12)
	            result = result + "in your kitchen";
	        
	        if(partySize>12)
	            result = result + "by a caterer";
	        System.out.println(result);
	        

	}
}