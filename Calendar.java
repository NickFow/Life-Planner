package lifePlanner;
import java.util.Scanner;
import java.time.Month;
import java.util.Arrays;

public class Calendar
{
	public void Calendar()
	{
		//Object to get the month
		Scanner UI = new Scanner(System.in);
		
		//This will list the Months, skipping 0 by adding a null value at the beginning
		String[] Months = {"null","January","February","March","April","May","June","July",
				"August","September","Octorber","November","December"};
		
		//This will list the number of days in each month
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
		
	
		//Create the calendar
		//Figure out a way to hold only 7 days in each row
		int j;
		System.out.println("      " + Months[userMonth] + " " + userYear);
		System.out.println(" S  M Tu  W Th  F  S");
		for(j = 1; j <= numberDays[userMonth]; j++)
			
			if(j < 8)
				System.out.print(" " + j + " ");
			else if(j < 15)
				System.out.print(" " + j + " ");
			else if(j < 22)
				System.out.print(" " + j + " ");
			else if(j < 28)
				System.out.print(" " + j + " ");
			else if(j < 32)
				System.out.print(" " + j + " ");
		
	}
}

	

