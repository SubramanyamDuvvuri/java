import java.util.*;

class studentinfo
{
	public static void main ( String [] arg )
	 {
		String Subjects[] = new String [4];

		System.out.println ( " enter the subjects" );
		Scanner input = new Scanner ( System.in);
		for( int  i = 0 ; i < Subjects.length ; i++ )
		{
			Subjects[i]= input.nextLine();
		}
		System.out.println ( "Enter the School name " );
		String School = input.nextLine();
		student student1 = new student("Billu", Subjects ,School);
		System.out.println ( " Student name is ");
		System.out.println (student1.name );
		System.out.println (" enter the percenttage to get the grade " );
		int percentage = input.nextInt();
		System.out.println("The grade obtaied by the student is " +   	student1.get_grade( percentage ));
		
	
				 
		

	}		

}		
