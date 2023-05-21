class SingletonExample {
    private static SingletonExample single_instance = new SingletonExample();

    public String s;

    private SingletonExample()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static SingletonExample getSingleton()
    {
        return single_instance;
    }
}

public class SingletonClass1 {

    public static void main(String args[])
    {
        SingletonExample x = SingletonExample.getSingleton();
  
        SingletonExample y = SingletonExample.getSingleton();
  
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");
  
        y.s = (y.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
    }
}