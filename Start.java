package lifePlanner;
import java.io.*;

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
		greetings greetings = new greetings();
		greetings.greetings();
		
		//Register
		Register register = new Register();
		register.register();

		//Home
		home home = new home();
		home.home();
	}
}