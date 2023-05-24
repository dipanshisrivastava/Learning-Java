enum Beer
{
    KF(100), KO(75), RC(90), FO;
    int price = 0;

    Beer(int price)
    {
        this.price = price;
    }
    Beer()
    {
       this.price = 65;
    }
    public int getPrice()
    {
        return price;
    }
}
public class EnumAndParameterizedConstructor {
    public static void main(String args[])
    {
        Beer[] b = Beer.values();
        for(Beer b1 : b)
        {
            System.out.println(b1 + " " + b1.getPrice());
        }
    }
}
