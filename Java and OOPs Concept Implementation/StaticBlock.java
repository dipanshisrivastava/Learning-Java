// Constructor is used to initialize the default value.
class Mobile
{
    String brand;
    int price;
    static String name;
    // static block is initialise only  once, when "Mobile class" is loaded by the "class loader".
    
    // static block
    static
    {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile(String b)
    {
        brand = b;
        price = 200;
        System.out.println("In constructor");
        // Since name is static, there is no use of initialising it for every object(call of constructor), So static block is used. 
        // name = "Phone";
    }

    public void show()
    {
        System.out.println(brand + " " + price + " " + name);
    }
}
public class StaticBlock
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile("Samsung");
        Mobile obj2 = new Mobile("Apple");
        
        obj1.show();
        obj2.show();
    }    
}
