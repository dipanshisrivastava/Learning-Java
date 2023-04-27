/******************************************************************************
Static member variable when qualified with final keyword, it becomes blank until initialized. W/o final keyword variable value be 0 by default.
*******************************************************************************/

public class Final_static_variable
{
  // After making object:
    
    
    private final static int x; // final static member variable
    
    // final static member variable can be initialized in two ways:
    // private final int x=5;              1. At the time of declaring variable
    static
    {x=4;}                                //2. Using intialization block

        
	public static void main(String[] args) {
	    Final_static_variable e = new Final_static_variable();
		System.out.println(e.x);
	}
}
