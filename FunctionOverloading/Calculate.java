// Method Overloading: If a class has multiple methods having same name but 
// different in parameters (either number of parameters or data type of parameters).

class Calculator
{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
}


public class Calculate {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int r1=obj.add(8,8);
		System.out.println(r1);
	}
}