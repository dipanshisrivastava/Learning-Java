/******************************************************************************

Finally Block
Print statement written in fianlly block will be printed always whether try is executed or gives an error.

*******************************************************************************/

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
This code is correct but we dont need to write finally only to close the resouce.

public class FinallyBlock
{
	public static void main(String[] args)
	{
        BufferedReader br = null;
        try
        {
            String str = "";
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            br.close();
        }
	}
}
*/


// Here we don't require catch and finally block, object can can be created inside the try block
// itself and the resouce will get deallocated as soon as it is done with the try block.
public class TryWithResources
{
	public static void main(String[] args) throws Exception
	{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
            String str = "";
            str = br.readLine();
        }
	}
}

