class Calculator
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
public class add
{
	public static void main(String[] args) {
//input of integer datatype
	    int num1=5;
	    int num2=4;
		
//className objectName = new constructor() 
		
	    Calculator calc = new Calculator();

	    int result = calc.add(num1, num2);
		System.out.println(result);
	}
}
