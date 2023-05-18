class AddOverloading
{
    public int add(int n1,int n2)
    {
        int r = n1+n2;
        return r;
    }
    public int add(int n1,int n2, int n3)
    {
        int r = n1+n2+n3;
        return r;
    }
    public Double add(Double n1, Double n2)
    {
        Double r = n1+n2;
        return r;
    }
}

public class MethodOverloading
{
    public static void main(String args[])
    {
        AddOverloading obj = new AddOverloading();
        
        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        Double num4 = 6.4;
        Double num5 = 6.2;
        int r1 = obj.add(num1, num2);
        int r2 = obj.add(num1, num2, num3);
        Double r3 = obj.add(num4, num5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}