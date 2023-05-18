class Mobile
{
    String brand;
    int price;
    static String name;

    // Static variables can be used in non-static methods.
    public void show()
    {
        System.out.println(name + " " + brand + " " + price); 
    }

}

public class StatcVariable {
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

        // Since name is same for all objects, therefore static can be used here.
        // Static variable is same for all the objects, created only once.
        // Since it is same for all the objects, it can be accessed using class name directly.
        // If one object changes the value of static variable, the the changed value will be appeared for all the objects.

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
