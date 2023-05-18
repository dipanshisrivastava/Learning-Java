class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(name + " " + brand + " " + price);
    }

    public static void show1()
    {
        // Can not access brand and price(instance variables) directly in static method.
        // System.out.println(name + " " + brand + " " + price);
        System.out.println(name + " ");
    }

    // Can access brand and price(instance variables) since they are passed as parameters.
    public static void show2(String brand, int price)
    {
        System.out.println(name + " " + brand + " " + price);
    }
}
public class StaticMethod
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        Mobile.name = "SmartPhone";
        obj1.price = 1700;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        Mobile.name = "SmartPhone";
        obj2.price = 1500;

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
                
        Mobile.show1();

        // Calling static method by passing instance variable as parameter.
        Mobile.show2("Apple", 1600);
        // obj1.show1();

        // obj1.show1();
    }  
}
