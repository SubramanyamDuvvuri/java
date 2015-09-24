/*general file operations*/

import java.io.*;
import java.util.Scanner;


public class fileoperations
{
	public static void main(String arg []) throws IOException
	{
		PrintWriter write_new = new PrintWriter("textfile.txt");
		
		write_new.println(" hello world");
		
		write_new.close();	
		
		FileWriter  apend = new FileWriter ( " textfile.txt",true);
		PrintWriter add = new PrintWriter(apend);
		add.println ("how are you");
		add.close();	 
 
	}
}


