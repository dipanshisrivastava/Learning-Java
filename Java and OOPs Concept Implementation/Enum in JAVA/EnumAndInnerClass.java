public class EnumAndInnerClass
{
    enum Beer
    {
        KF, KO, RC, FO;
    }
    public static void main(String args[])
    {
        Beer b = Beer.RC;
        System.out.println(b);
    }
}