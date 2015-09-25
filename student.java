public  class student
{
	String name;
	int age;
	String School;
	String Subjects [] ;
	


	//Cnstructor

	public student ( String n , String [] S, String Sch )
	{
		name = n;
		Subjects = new String [S.length];
		School = Sch;
		for ( int i = 0 ; i <S.length ; i ++ )
		{
			Subjects [i] = S[i];
		}
	}
	
	
	public String get_grade (int Marks )
	{
		if (Marks >= 90)
			return "A";
		else if ( Marks >=70 || Marks < 90)
			return "B";
		else
			return "C";
	}

	


}
 
