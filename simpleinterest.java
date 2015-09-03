import java.util.*;

class simpleinterest
{
	public static void main (String [] arg )
	{
		Scanner input = new Scanner ( System.in );
		double[] Principle= new Principle[10] ;
		double[] Rate= new Rate[10] ; 
		double[] Time=new time [10];
		double[] SI=new SI [10];
		
		System.out.println ( "Enter principle , rate and time in years respectively");
		for ( int i =0; i<10;i++)
		{
			Principle[i] = input.nextDouble();
			Rate[i] = input.nextDouble();
			Time[i] = input.nextDouble();
			SI[i]=calculate(Principle[i],Rate[i],Time[i]);
			System.out.println(SI[i] +" is the simple interest");
		}
	}


	public static double calculate ( double P, double R , double T) 
	{
		double SI=  (P*R*T)/100;

		return SI;
	}	


}
