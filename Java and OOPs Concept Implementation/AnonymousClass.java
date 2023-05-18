class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}

// Purpose of class B is to just override the show method.
/*
class B extends A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
*/

public class AnonymousClass
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In B show");
            }
        };
        obj.show();
    }
}
