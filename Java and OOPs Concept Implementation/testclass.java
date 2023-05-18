abstract class AbstractExample
{
    static int a = 2;
    abstract public void show();
}

class A extends AbstractExample
{
    public void show()
    {
        System.out.print("Hii");
    }
}

public class testclass {
    public static void main(String args[])
    {
        // A obj = new A();
        // System.out.println(obj.a);
        // obj.a = 5;
        // System.out.println(obj.a);
        AbstractExample.a=5;
    }
}
