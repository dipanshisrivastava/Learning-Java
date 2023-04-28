// abstract class without any abstract method
  

// An abstract class without any abstract method
abstract class Base {
  
    // This is not an abstract method.
    void fun()
    {
        // Print message if class 1 function is called
        System.out.println("Base class function");
    }
}
  

class Derived extends Base {
  //This class only inherits the Base class methods and properties 
  
}
  

class abstractClassWithNoAbstractMethod {
  
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of Derived class
        Derived d = new Derived();
  
        // Calling function defined in Base class inside main() with object of Derived class
        d.fun();
    }
}
