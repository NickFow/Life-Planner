package lifePlanner;

public class monthsArray {
	public static void monthsArray()
	{
	
	/* This array needs to be size 12, and store 
	 * 29-31 arrays.
	 * 
	 * I also need to create an object for days.
	 */
	daysArray days = new daysArray();
		
	int[] months;
	months = new int[12];
	
	//Array
	//Replace values with more arrays
	months[0] = days.january();
	months[1] = 2;
	months[2] = 3;
	months[3] = 4;
	months[4] = 5;
	months[5] = 6;
	months[6] = 7;
	months[7] = 8;
	months[8] = 9;
	months[9] = 10;
	months[10] = 11;
	months[11] = 12;
	
	int i;
	for(i = 0; i < 12; i++)
		System.out.println(months[i]);
	}
}
