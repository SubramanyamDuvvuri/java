class examplearray 
{
	public static  void main ( String [] arg )
	{
		final int MAX = 6;
		int number [] = new int  [MAX];	
				
		for ( int i = 0 ; i < 2 ; i++)
		{
			number[i] = i+7;
		}
	 
		
		for ( int i = 0 ; i < number.length ; i++)
		{
			System.out.println (number[i]);
		}
		
		examplearray o = new examplearray();
		o.show(number);
	}


	public  void show ( int n [] ) 
	{

			for ( int i = 0 ; i < n.length ; i++)
		{
			System.out.println (n[i]);
		}
		  
	}
		  
		  
		  

}
