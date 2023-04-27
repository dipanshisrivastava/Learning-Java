/******************************************************************************
Final local variable: is inside a function.
Local member variable when qualified with final keyword, it becomes blank until initialized. W/o final keyword variable value will also be blank by default but 
by writing final keyword variable value can not be changed once initialized.
*******************************************************************************/

public class Final_local_variable
{
  // After making object:

    public void fun()
    {
        /* int k;
            k=k+1  will give erroe because k is blank and 1 can not be added to blank variable. */
            
        final int k = 4;
        System.out.println(k);
    }
	public static void main(String[] args) {
	    Final_local_variable e = new Final_local_variable();
	    e.fun();
	}
}
