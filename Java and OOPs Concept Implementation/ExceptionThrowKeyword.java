public class ExceptionThrowKeyword
{
    public static void main(String a[])
    {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            // I want to execute the first catch block and print default value if j=0.
            if(j==0)
                throw new ArithmeticException("I don't want to print zero");
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("Thats the default output " + e);
        }
        catch(Exception e)
        {
            System.out.print("Something went wrong" + e);
        }

        System.out.println(j);
    }
}
