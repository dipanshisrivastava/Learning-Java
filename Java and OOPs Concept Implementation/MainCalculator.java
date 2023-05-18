class Calculator
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    } 
}

public class MainCalculator
{
    public static void main(String args[])
    {
        int num1 = 2;
        int num2 = 4;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}