/******************************************************************************
 * 
Final vaiables can be initialized only once.

*******************************************************************************/

public class Final_instance_variable
{
  // After making object:
    
    // Since x is a instance variable, value 0 will be assigned to x by default
    // private int x;
    
    // By writing keyword final, value 0 will not be assigned to x, it will be a blank variable(no value of x)
    private final int x;
    
    // Now, x can be initialized in three ways:
    // private final int x=5;              1. At the time of declaring variable
    // {x=5}                               2. Using intialization block
        Final_instance_variable()               // 3. Using constructor
        {x=5;}
        
	public static void main(String[] args) {
	    Final_instance_variable e = new Final_instance_variable();
		System.out.println(e.x);
	}
}
