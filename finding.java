/* the code is to find the highestand the lowest values o a numric array */
import java.util.*;
class finding
{
	public static void main ( String [] arg) 
	{
		System.out.println ("Enter the length of the array ");
		Scanner input = new Scanner ( System.in);
		int Array_Size= input.nextInt();
	
		int array[] = new int [Array_Size];
		System.out.println ("Enter the array values \n" );
		for ( int  i = 0; i< Array_Size ; i++)
		{
			
			int temp = input.nextInt();
			array[i]= temp;
			
			//System.out.println ( i );
		}

		//finding the greatest number in an array
		int val = array [0];			
		for ( int i = 0 ; i <array.length ;)
		{	
			if (val < array[i])
			{
				i++;
			}
			else
			{
				val = array[i];
				i++;
			}

				
		}
		System.out.println ("\n"+val);			

	}

	


}

