enum Beer
{
    KF, KO, RC, FO;
}
public class EnumOrdinal
{
    public static void main(String args[])
    {
        Beer[] b = Beer.values();
        for(Beer b1 : b)
        {
            System.out.println(b1 + " " + b1.ordinal());
        }

    }
}

// values is a keyword which is used with enum, it is used to get all the values which is declared