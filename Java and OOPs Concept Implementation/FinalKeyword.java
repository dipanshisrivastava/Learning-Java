/*
 Final keyword can be used with variables, methods and classes.

 Final keyword is used with variables to make them constent(values can not be changed).
 Final keyword is used with methods to stop method overriding.
 Final keyword is used with class to stop inheritence.

 */

// Using final keyword will not let class A to extend(inherit) class Calc-------(stop inheritance).
// final class Calc
class Calc
{

    // Using final keyword will not let show method of class A to override show method of class Calc-------(stop inheritance).
    // final public void show()
    public void show()
    {
        System.out.println("It's Riya's Calculator");
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class A extends Calc
{
    public void show()
    {
        System.out.println("It's Jhon's Calculator");
    }
}
public class FinalKeyword
{
    public static void main(String args[])
    {
        final int a = 10;
        // Value can not be changed.
        //a = 9;
        System.out.println(a);

        A obj1 = new A();

        obj1.show();

    }    
}
