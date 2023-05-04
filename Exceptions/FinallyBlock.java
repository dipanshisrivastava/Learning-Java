/******************************************************************************

Finally Block
Print statement written in fianlly block will be printed always whether try is executed or gives an error.

*******************************************************************************/

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FinallyBlock
{
	public static void main(String[] args)
	{
	    int i=8, j=1, k=0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     try
	     {
	         System.out.println("Enter a number: ");
	         j = Integer.parseInt(br.readLine());
	         k = i/j;
	         System.out.println("Output is: " + k);
            //If we want BYE to be printed even if this code gives an error then we may write same
            //statement at line 34 but this line will be redundant, therefore we can use finally block.
            //  System.out.println("BYE");
	     }
	     catch(IOException e)
	     {
	         System.out.println("Some IO Error");
	     }
	     catch(ArithmeticException e)
	     {
	         //System.out.println("BYE");
	         System.out.println("Cannot divide by zero");
	     }
	     catch(Exception e)
	     {
	         System.out.println("Unknown Exception");
	     }
	     finally
	     {
	         System.out.println("Finally BYE");
	     }
	     
	}
}
