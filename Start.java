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
		Register.Register();
		
		/*Testing Array
		MonthsArray monthsArray = new MonthsArray();
		MonthsArray.monthsArray();
		*/
	}
}
