import java.util.*;

class simpleinterest
{
	public static void main (String [] arg )
	{
		Scanner input = new Scanner ( System.in );
		double Principal ;
		double Rate ; 
		double Time;
		double SI;
		
		System.out.println ( "Enter principle , rate and time in years respectively");
		Principal = input.nextDouble();
		Rate = input.nextDouble();
		Time = input.nextDouble();
		SI=calculate(Principal,Rate,Time);
		System.out.println(SI +" is the simple interest");
	}


	public static double calculate ( double P, double R , double T) 
	{
		double SI=  (P*R*T)/100;

		return SI;
	}	


}
