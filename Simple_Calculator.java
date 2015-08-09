/* simple calculator */

import java.util.Scanner; 

class Simple_Calculator 
{
	public static void main (String [] args )
	 {
		System.out.println ( " enter two numbers " ) ;	
		Scanner x = new Scanner ( System.in );
		double a ,b ;
		a = x.nextDouble();
		b = x.nextDouble();	
			
		while (true )
		{ 
			System.out.println(" Enter the operation that needs to be performed" ) ;
			System.out.println( " 1. Add\n 2 .subtract \n 3. exit  " ) ;
		
			int input = x.nextInt();
			
			switch ( input )
			{	
				case 1 : System.out.println(a+b);
					break ;	
				case 2 : System.out.println ( a-b ) ;
					break;	 
				case 3 : System.exit(0);
				default : break ;
			}
		 

		}
	}
}
