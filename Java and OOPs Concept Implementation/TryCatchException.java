public class TryCatchException
{
    public static void main(String args[])
    {
        int i=0;
        int j=0;

        // By writing try-catch block, even if the exception occurs further code will be implementd after executing catch block(the execution will not stop because of the exception occured).

        try
        {
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

        System.out.println("Bye");
    }    
}
