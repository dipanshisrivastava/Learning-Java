// Java program implementing Singleton class with using  getInstance() method

// Helper class
class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = new Singleton();
  
    // Declaring a variable of type String
    public String s;
  
    // Constructor
    // Here we will be creating private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance()
    {
        return single_instance;
    }
}
  
// Main class
class SingletonClass {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
  
        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
  
        // Printing the hash code for above variable as declared
        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
  
        // Condition check
        if (x == y)
        {
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else
        {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}