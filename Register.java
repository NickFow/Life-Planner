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
			
	}	
			//Age
		public void age(){
				
			Scanner userInput = new Scanner(System.in);
			
			try{
				System.out.print("Age: ");
				int age = userInput.nextInt();
				userInput.nextLine();
				System.out.println();
			}
			catch(Exception e){
				System.out.println();
				System.out.println("Please enter a number for your age!");
				age();
			}
		System.out.println();
	}	
}

