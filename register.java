import java.util.Scanner;

public class register {

	public void Register()
	{
			//Register 
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! Before we jump into managing your life, we must ask some simple ");
			System.out.println("information of you.");
			System.out.println();
			System.out.println();
			
			System.out.print("First Name: ");
			String firstName = userInput.next();
			userInput.nextLine();
			
			System.out.println();
			
			System.out.print("Last Name: ");
			String lastName = userInput.next();
			userInput.nextLine();
			
			System.out.println();
			
			System.out.print("Email: ");
			String email = userInput.next();
			userInput.nextLine();
			
			System.out.println();
			
			System.out.print("Age: ");
			int age = userInput.nextInt();
			userInput.nextLine();
	}
}
