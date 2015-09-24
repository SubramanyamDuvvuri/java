class examplearray 
{
	public static void main ( String [] arg )
	{
		final int MAX = 6;
		int number [] = new int  [MAX];	
		
		for ( int i = 0 ; i < number.length ; i++)
		{
			number[i] = i;
		}
	 


		System.out.println (number);
	}
}
