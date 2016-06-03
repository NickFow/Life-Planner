package lifePlanner;
import java.util.Scanner;

public class Start 
{
	public static void main(String[] args)
	{
		//Greetings 
		//This will be the first screen
		System.out.println("Welcome to Life Planner!");
		System.out.println();
		System.out.println("Press enter to contine...");
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		userInput.nextLine();
		
		//Calls upon Register Class
		//This will need a separate screen, but can be nearly identical to the Greetings screen
		Register register = new Register();
		register.register();
		
		//I feel like creating the home screen right now, so Im skipping any tutorial screen
		home home = new home();
		home.home();
		
	}
}