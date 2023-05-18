// Lambda Expression: It isused to reduce the number of lines in code.
// It works only with the Functional Interface as it has only one method.

interface A
{
    void show(int i);
    // If there will be more than one method in interface then there will be confusion which method to be called in lambda expression.
    // void config(int i);
}

public class LambdaExpression
{
   public static void main(String args[])
   {
        /*
        A obj =new A()
        {
            public void show(int i)
            {
                System.out.println("In show " + i);
            }
        };
        */

        // Reduced code:

        /*
        A obj =(int i) ->
            {
                System.out.println("In show " + i);
            };
        */

// If there will bemore than one method in interface then there will be confusion which method to call.

        // It can be further reduced to one line of code.
        A obj = i -> System.out.println("In show " + i);
        
        obj.show(5);
   } 
}
