package lifePlanner;

import java.util.Scanner;

public class Calendar
{
	

	public static void Calendar()
	{
	     	     
		//Object to get the month
		Scanner UI = new Scanner(System.in);
		
		//This will list the Months, skipping 0 by adding a null value at the beginning
		String[] Months = {"null","January","February","March","April","May","June","July",
				"August","September","Octorber","November","December"};
		
		//This will list the number of numberDays in each month
		int[] numberDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		//Print the months out for the user
		int i;
		for(i = 1; i <= 12; i++)
			System.out.println("[" + i + "] " + Months[i]);
		
		System.out.println();
		
		
		//Asking for the month and year
		//Month
		System.out.println("What month is it? Type the number representation of the month!");
		int userMonth = UI.nextInt();
		System.out.println();
		
		//Year
		System.out.println("And what year is it?");
		int userYear = UI.nextInt();
		System.out.println();
		
		//Starting day
		int d;
	
		/*Create the calendar
		 * 
		 *Figure out a way to hold only 7 days in each row
		 * This calendar is nasty, but it has to suffice!
		 * 
		 */
		System.out.println("      " + Months[userMonth] + " " + userYear);
		
		for(d = 1; d <= 7; d++)
			
			System.out.print(" " + d + " ");
		
		System.out.println();
		
		for(d = 8; d <= 9; d++)
			System.out.print(" " + d + " ");
		
		//This almost seems unneccasary, but if this is not included the spacing looks awful.
		for(d = 10; d <= 14; d++)
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 15; d <= 21; d++)
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 22; d <= 28; d++ )
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 29; d <= numberDays[userMonth]; d++)
			System.out.print(d + " ");
			
		System.out.println();
		System.out.println();
		System.out.println("If you wish to view a day, type 1...");
		System.out.println("If you wish to return to the home menu, type 2...");
		
		System.out.println();
		int decision = UI.nextInt();
		
		switch(decision)
		{
		case 1:
			//Direct to a new class for days
			break;
			
		case 2:
			home home = new home();
			home.home();
			break;
		
		default:
			System.out.println();
			System.out.println();
			System.out.println("That number is not listed, please choose from the listed numbers.");
			System.out.println("Press enter to continue...");
			UI.nextLine();
			UI.nextLine();
			System.out.println("");
			System.out.println("");
			Calendar.Calendar();
			
		}
		
	
			
			
	     	
	}
}