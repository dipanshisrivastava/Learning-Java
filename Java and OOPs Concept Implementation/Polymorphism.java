class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}

public class Polymorphism
{
    public static void main(String args[])
    {
        // Object of child class can be assigned to reference variable of parent class.
        A obj = new B();

        // We can know during run time which show method is called this is known as run time polymorphism.
        // show method of parent class will be executed but since it is overridden by B class, therefore show method of B class will be executed.
        obj.show();
    }    
}
