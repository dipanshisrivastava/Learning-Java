// Run this program on online gdb compiler

enum Beer
{
    KF, KO, RC, FO;
    Beer()
    {
        System.out.println("Constructor");
    }
}
public class EnumAndConstructor {
    public static void main(String args[])
    {
        Beer b = Beer.KF;
        System.out.println(b);
    }
}
