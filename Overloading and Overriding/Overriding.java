/* Here method f1 in class A is overridden by method f1 in class B

Suppose f1 is the method for gearing a car; let car and sports car have differnt gears, then 
we would override the gear method f1 of the car with the gear method f1 of the sports car. */

class A // Car
{
    public void f1(int x)
    {
        System.out.println("Class A");
    }
}
class B extends A // Sports Car
{
    public void f1(int x)
    {
        System.out.println("Class B");
    }
}
public class Overriding
{
	public static void main(String[] args) 
	{
	    B obj = new B();
	    obj.f1(5);
	}
}
