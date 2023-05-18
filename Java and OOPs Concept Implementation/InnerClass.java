// if class B is completely dependent on class A, then we can create class B inside class A(inner class).
class A
{
    int age;

    public void show()
    {
        System.out.println("In show");
    }
    class B
    {
        public void configB()
        {
            System.out.println("In config B");
        }
    }
    static class C
    {
        public void configC()
        {
            System.out.println("In config C");
        }
    }
}

public class InnerClass
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        A.B objB = obj.new B();
        objB.configB();

        // Static class can be accessed without the object of outer class.
        A.C objC = new A.C();
        objC.configC();
    }    
}
