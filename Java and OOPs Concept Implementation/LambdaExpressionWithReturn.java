interface A
{
    int add(int i, int j);
}

public class LambdaExpressionWithReturn
{
    public static void main(String a[])
    {
        /*
        A obj = new A()
        {
            public int add(int i, int j)
            {
                return i+j;
            }
        };
        */
        // when there is only one statement in lambda expression and that too is return than there is no need to write return keyword.

        A obj = (i,j) -> i+j;

        int result = obj.add(4,4);
        System.out.println(result);
    }
}
