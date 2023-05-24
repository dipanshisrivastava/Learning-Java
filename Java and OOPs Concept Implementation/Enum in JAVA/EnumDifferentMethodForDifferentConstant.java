enum color
{
    Blue, Red
    // {
    //     public void show()
    //     {
    //         System.out.println("Dangerous color");
    //     }
    // }
    , Green;
    public void show()
    {
        System.out.println("Universal color");
    }
}

public class EnumDifferentMethodForDifferentConstant
{
    public static void main(String args[])
    {
        color[] c = color.values();
        for(color c1 : c)
        {
            c1.show();
        }
    }
}
