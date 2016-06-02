import java.util.Scanner;

public class Start {
	
	public static void main(String[] args)
	{
		//Greetings 
		System.out.println("Welcome to Life Planner!");
		System.out.println();
		System.out.println("Press enter to contine...");
		Scanner userInput = new Scanner(System.in);
		System.out.println();
		userInput.nextLine();
		
		//Register
		register Register = new register();
		Register.register();
		
		
		//I feel like creating the home screen right now, so Im skipping any tutorial screen
		home home = new home();
		home.home();
		
	}
}
