/******************************************************************************
Methods declared as final cannot be overridden.
*******************************************************************************/
final class person
{
    public final void someFunction()
    {
        
    }
}
/* 
class student extends person                     //will give error, can not be overridden.
{
    public void someFunction() 
    {
        
    }
} 
*/

public class Final_method
{
	public static void main(String[] args) {
	   // student s = new student();
	}
}
