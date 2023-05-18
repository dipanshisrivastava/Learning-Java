class A
{
    public void show1()
    {
        System.out.println("In show A");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In show B");
    }
}

public class TypeCasting
{
    public static void main(String args[])
    {
        // Upcasting
        A obj = new B();
        // Reference variable of A is created therefore show1 will be excuted, it has no clue of any methods in class B, parent class has no clue about which other class has inherited it.
        obj.show1();

        // Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}
