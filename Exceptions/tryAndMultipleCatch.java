//program to print the exception(try and multiple catch)

class tryAndMultipleCatch 
{
    public static void main (String[] args) 
    {
      int i=8;
      int j=2, k=0;
      int a[] = new int[4];
        try
        {
            k = i/j;
            for(int c=0; c<=4; c++)
            {
                a[c] = c+1;
            }
            for(int value : a)
            {
                System.out.println(value);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by  zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Maxium number of value is 4");
        }
    }
}