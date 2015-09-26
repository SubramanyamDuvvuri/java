import java.util.*;

class studentinfo
{
	public static void main ( String [] arg )
	 {
		String subjects[] = new String [4];

		Scanner input = new Scanner ( System.in);
		
		//Creating array of objects 
		student student_info [] = new student [3];
		
		for (int j=0 ; j< student_info.length ; j++) 
		{
				System.out.println (" Enter the name of the student ----> " +j);
				String temp_name = input.nextLine();		
				
				System.out.println ( " enter the subjects" );
	
				for( int  i = 0 ; i < subjects.length ; i++ )
				{
					subjects[i]= input.nextLine();
				}
				System.out.println ( "enter the school name " );
				String school = input.nextLine();
				student_info[j] = new student(temp_name , subjects , school );
		}			


		System.out.println ( " Student name is ");
		System.out.println (student_info[1].name );
		System.out.println (" enter the percenttage to get the grade " );
		int percentage = input.nextInt();
		System.out.println("The grade obtaied by the student is " +   	student_info[1].get_grade( percentage ));
		
	
				 
		

	}		

}		
