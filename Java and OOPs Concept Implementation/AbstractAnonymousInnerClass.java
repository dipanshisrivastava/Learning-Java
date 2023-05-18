abstract class A
{
    abstract public void show();
}

// To use show method class A we need to define it in concreat(non-abstract) class.
// If we want to use show method only once, instead of defining it in a new class we can use anonymous inner class.

public class AbstractAnonymousInnerClass
{
    public static void main(String args[])
    {
        // Creating object of abstract class is not possible.
        // But here we are creating object of anonymous inner class.
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In A show");
            }  
        };
        obj.show();
    }    
}
