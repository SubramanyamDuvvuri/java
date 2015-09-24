 class Rectangle
{
	private double length;
	private double width;

	
	// the setlength () method is used to set the length of the rectangle
/*	public   void setlength ( double len)
	{
	 	length = len ;
	}
	
	//setwidth method is used to set the width of the rectangle
	public void  setwidth( double wid)
	{
		width=wid ;
	}
*/
	
	//for displaying the length
	public double getlength()
	{
		return length;
	}
	
	//for displaying the width
	public double getwidth()
	{
		return width;

	}

	// Constructor , Should have the same name as of the class and should not have a return type not even void  

	public Rectangle( double l , double w )
	{
		length = l;
		width = w;
	}

	
	 
	
}
