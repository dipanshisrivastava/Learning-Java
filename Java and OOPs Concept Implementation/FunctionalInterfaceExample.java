// FunctionalInterface: An interface that can hvae only one abstract method.
// Also known as SAM (Single Abstract Method)

@FunctionalInterface
interface A
{
    void show();
}

// Can be written as inner classs

/*
class B implements A
{
    public void show()
    {
        System.out.println("In show");
    }
}
*/

public class FunctionalInterfaceExample
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
