enum Beer
{
    KF, KO, RC, FO;
}
public class EnumValues
{
    public static void main(String args[])
    {
        Beer[] b = Beer.values();
        for(Beer b1 : b)
        {
            System.out.println(b1);
        }

    }
}