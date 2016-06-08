package lifePlanner;
import java.io.*;
import java.util.Scanner;

public class Start 
{
	public static void main(String[] args)
	{
		/* 
		 *   To do List: 
		 *   
		 * - Tutorial Screen
		 * - Create days
		 * - Store values in days
		 * - Create some kind of GUI
		 * - I need try blocks for a lot of the int data types
		 * - I need to end some variables and not leave them open
		 * - Eventually write to file
		 * 
		 */
		
		//Greetings 
				//This will be the first screen
				System.out.println("Welcome to Life Planner!");
				System.out.println();
				System.out.println("Press enter to contine...");
				Scanner userInput = new Scanner(System.in);
				System.out.println();
				userInput.nextLine();
		
		//Register
		Register register = new Register();
		register.register();
		register.age();

		//Home
		home home = new home();
		home.home();
	}
}