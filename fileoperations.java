/*general file operations*/

import java.io.*;
import java.util.Scanner;


public class fileoperations
{
	public static void main(String arg []) throws IOException
	{
		PrintWriter operation = new PrintWriter("textfile.txt");
		
		operation.println(" hello world");
		
		operation.close();	

 
	}
}


