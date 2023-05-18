class A extends Thread
{
    public void run()
    {
        for(int i=0; i<500; i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=0; i<500; i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class MultipleThreads
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try
        {
            Thread.sleep(2);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        obj2.start();
    }    
}
