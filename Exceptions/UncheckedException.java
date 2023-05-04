/******************************************************************************

Unchecked Exceptions
These are the exceptions that are checked at runtime.

*******************************************************************************/

class UncheckedException
{
   public static void main(String args[])
    {
        try
	     {
            int x = 0;
            int y = 10;
            int z = y / x;
	     }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e)
        {
            System.out.println("Unknown Exception");
        }
    }
}
