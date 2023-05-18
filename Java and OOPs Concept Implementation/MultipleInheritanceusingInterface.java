interface A
{    
    void show();
}

interface B
{
    void config();
}

// interface extends interface.
// Multi-level inheritance can be achieved by interface.
interface C extends A,B
{
    void run();
}

// class implements interface.
// Multiple inheritance can be achieved by interface.
class D implements A,B
{
    public void show()
    {
        System.out.println("In show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("In run");
    }
}

public class MultipleInheritanceusingInterface
{
    public static void main(String args[])
    {
        D obj = new D();
        obj.show();
        obj.config();
        obj.run();
    }   
}
