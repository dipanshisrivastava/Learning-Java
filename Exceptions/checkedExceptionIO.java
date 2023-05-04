/******************************************************************************

Checked Exceptions
These are the exceptions that are checked at compile time like IOException, FileNotFoundException.

*******************************************************************************/

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class checkedExceptionIO
{
	public static void main(String[] args)
	{
	    int i=8, j=1, k=0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     try
	     {
	         j = Integer.parseInt(br.readLine());
	         k = i/j;
	     }
	     catch(IOException e)
	     {
	         System.out.println("Some IO Error");
	     }
	     catch(ArithmeticException e)
	     {
	         System.out.println("Cannot divide by zero");
	     }
	     catch(Exception e)
	     {
	         System.out.println("Unknown Exception");
	     }
	     System.out.println(k);
	}
}
