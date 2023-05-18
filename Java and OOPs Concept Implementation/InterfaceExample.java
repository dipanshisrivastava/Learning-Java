interface A
{
    int age = 22;
    String area = "Mumbai";

    void show();
    void config();
}

interface Z
{
    int age = 21;
    // String area = "Mumbai";

    // void show();
    // void config();
}

class B implements A
{
    public void show()
    {
        System.out.println(A.age);
        System.out.println("In show");
    }

    public void config()
    {
        System.out.println(area);
        System.out.println("In congfig");
    }
}

public class InterfaceExample
{
    public static void main(String args[])
    {
        A obj = new B();
        obj.show();
        obj.config();
    }    
}
