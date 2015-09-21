/* example of a funtion and using the return value */
import java.util.*;

class functionexample{

	public static void main (String arg [])
	{
	  System.out.println(" enter the principal , rate and the time ");
	  Scanner input = new Scanner (System.in );
	  double principal = input.nextDouble();
     	  double rate = input.nextDouble ();
	  double time = input.nextDouble () ;
		
	  System.out.println ( "the simple interest of" +principal +" rate" + rate + " and for time " + time + " is " + SI ( principal , time , rate ));
	}

	public static double SI ( double p , double t , double r )
	{
		return ( p * r * t*.01 );
	}  			
	



}
