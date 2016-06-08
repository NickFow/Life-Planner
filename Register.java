package lifePlanner;

import java.util.Scanner;

public class Register {
			
	public void register()
	{
			//Register
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! Before we jump into managing your life, we must ask some simple ");
			System.out.println("information of you.");
			System.out.println();
			System.out.println();
			
			
			//First Name
			System.out.print("First Name: ");
			String firstName = userInput.next();
			userInput.nextLine();
			System.out.println();
			
			
			//Last Name
			System.out.print("Last Name: ");
			String lastName = userInput.next();
			userInput.nextLine();
			System.out.println();
			
			//Email
			System.out.print("Email: ");
			String email = userInput.next();
			userInput.nextLine();
			System.out.println();
			
			
			//Age
			try
			{
			System.out.print("Age: ");
			int age = userInput.nextInt();
			userInput.nextLine();
			}
			catch(Exception InputMismatchException)
			{
			}
			
			finally{
			}
			
			System.out.println();
			System.out.println();
	}
}
