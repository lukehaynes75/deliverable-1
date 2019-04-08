import java.util.Scanner;

public class what2eat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eventType = null;
		int partySize = 0;
		String foodType = null;
		String cookLoco;
		String result;
		boolean prep = true;
		boolean erep = true; 
		Scanner escnr = new Scanner(System.in).useDelimiter("\\n");
		Scanner pscnr = new Scanner(System.in);
		
		
		System.out.println("Hello please enter the size of your party.");
		//options for party size
		while(prep) {
			try {
				prep = false;
				partySize = pscnr.nextInt();
				if(partySize < 1)
					throw new IllegalArgumentException();
			} catch(IllegalArgumentException iae) {
				System.out.printf("Party size must be greater than 1.\n", iae.getMessage());
				prep = true;
			}
		}
		
		switch(partySize) {
		case 1: cookLoco = "in the microwave";
				break;
		case 2: case 3: case 4:
		case 5: case 6: case 7:
		case 8: case 9: case 10:
		case 11: case 12: cookLoco = "in your kitchen";
			break;
		default: cookLoco = "by a caterer";
			break;
		}
		
		System.out.println("What type of event are you having?");
		//food choices by type of event
		while(erep)
		{
			erep = false;
			try {
				eventType = escnr.nextLine();
				
				if(eventType.equalsIgnoreCase("Casual"))
					foodType = "sandwiches";
				else if(eventType.equalsIgnoreCase("Semi-Formal") || eventType.equalsIgnoreCase("Semi Formal"))
					foodType = "fried chicken";
				else if(eventType.equalsIgnoreCase("Formal"))
					foodType = "chicken parm";
				else
					throw new IllegalArgumentException();
			} catch(IllegalArgumentException iae) {
				System.out.printf("Invalid event type please try again.\n", iae.getMessage());
				erep = true;
			}
		}

		result = "You are hosting a " + eventType + " event for " + partySize +
				" guests, you should serve " + foodType + " prepared " + cookLoco + ".";
		System.out.printf("%s", result);
}
	}


