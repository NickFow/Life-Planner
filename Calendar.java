package lifePlanner;

import java.util.Scanner;

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
		int[] Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
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
	
		//Create the calendar
		//Figure out a way to hold only 7 days in each row
		System.out.println("      " + Months[userMonth] + " " + userYear);
		
		for(d = 1; d <= 7; d++)
			
			System.out.print(" " + d + " ");
		
		System.out.println();
		
		for(d = 8; d <= 9; d++)
			System.out.print(" " + d + " ");
		
		for(d = 10; d <= 14; d++)
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 15; d <= 21; d++)
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 22; d <= 28; d++ )
			System.out.print(d + " ");
		
		System.out.println();
		
		for(d = 28; d <= Days[userMonth]; d++)
			
			
	     	
	}
}