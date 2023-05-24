enum Beer
{
    KF, KO, RC, FO;
}
public class EnumSwitch
{
    public static void main(String args[])
    {
        Beer b = Beer.RC;
        switch(b)
        {
            case KF:
                System.out.println(b + " Kingfisher");
                break;
            case KO:
                System.out.println(b + " King Out");
                break;
            case RC:
                System.out.println(b + ": Royal Challenge");
                break;
            case FO:
                System.out.println(b + " Foster's");
                break;
            default:
                System.out.println("Different beer");
        }
    }
}