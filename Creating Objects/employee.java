public class employee
{
    private String empname;
    private double commission;
    
    public String getname()
    {
        return empname;
    }
    public double getcomm()
    {
        return commission;
    }
    
    public void setname(String name)
    {
        empname = name;
    }
    public void setcomm(double commission)
    {
        this.commission = commission;
    }
	public static void main(String[] args) {
	    
	    employee emp1 = new employee();
	    emp1.setname("Riya");
	    emp1.setcomm(98.27);
	    
	    employee emp2 = new employee();
	    emp2.setname("Abby");
	    emp2.setcomm(81.42);
	    
		System.out.println("Employee name is: " + emp1.getname());
		System.out.println("Employee commission is: " + emp1.getcomm());
		
		System.out.println("Employee name is: " + emp2.getname());
		System.out.println("Employee commission is: " + emp2.getcomm());
	}
}
