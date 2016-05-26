
public class MonthsArray {
	
	public static void monthsArray()
	{
	
	/* This array needs to be size 12, and store 
	 * 29-31 arrays.
	 */
	int[] months;
	
	months = new int[12];
	
	//Array
	months[0] = 1;
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
