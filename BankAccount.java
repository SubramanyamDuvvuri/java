public class  BankAccount 
{
	private String Name;
	private double AccountNo;
	private int Balance;
	private int Validity;

	//Constructor
	public BankAccount ( String N , double  A , int B , int V )
	{
		Name = N ;
		AccountNo = A;
		Balance = B;
		Validity = V ;
	}
	//getting the data back
	//Name
	public String getName ()
	{
		return Name;
	}
	//Account number
	public double getAccountNo ()
	{
		return AccountNo;

	}
	
	// Balance 
	public int getBalance ()
	{
		return Balance;
	}
	
	public int getValidity ()
	{
		return Validity;
	}


}	
