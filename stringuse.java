/*String operaions*/

import java.util.Scanner;


public class stringuse{

	public static void main(String [] arg)
	{
		String name1,name2;			//making two string referene variabls
		int choice;
		Scanner input= new Scanner (System.in);
			
		System.out.println ("Enter the two names");

		name1 = input.nextLine();
		name2 = input.nextLine();

		while (true)
		{
			System.out.println("enter the operation u wantto perform");
			System.out.println ("1.Compare \n 2.length \n 3. exit ");
			choice = input.nextInt();
			switch (choice)
				{	
				 case 1 : if ((name1.compareTo(name2) >1))
				 		System.out.println ( name1+ " is greater");
					else if((name1.compareTo(name2)<1))
						System.out.println ( name2+ "is greater");
					else 
						 System.out.println("both are equal");
					break;
		
				case 2 : System.out.println ("length of"+  name1 +"is "+ name1.length());
					 System.out.println ("length of "+name2 +"is " +name2.length());
						break;

				case 3 : System.exit(0);


			}
 	

		
		}



	}	
}
