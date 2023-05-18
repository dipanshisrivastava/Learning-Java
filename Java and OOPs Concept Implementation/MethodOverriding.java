//Overriding: It is way to override the parent class method in child class.

class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}

class AdvanceCalc extends Calc
{
    // Overriding "add" method: because I want to use only sub method of "Calc" class and different add method.
    public int add(int n1, int n2,int r)
    {
        return n1+n2+r;
    }
}

public class MethodOverriding
{
    public static void main(String args[])
    {
        AdvanceCalc obj = new AdvanceCalc();

        System.out.println(obj.add(5, 4));
        System.out.println(obj.sub(5, 4));
    }
}
