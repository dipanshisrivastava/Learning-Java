abstract class A
{
    abstract public void show();
}

interface B{
    void hello();
}
public class AbstractLambda {
    public static void main(String args[])
    {
        B obj = () -> System.out.println("Hello");
        
        obj.hello();
    }
}
