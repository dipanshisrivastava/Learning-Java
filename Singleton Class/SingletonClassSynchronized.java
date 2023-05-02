class SingletonClassSynchronized
{
public static void main(String args[])
{
	Thread t1 = new Thread(new Runnable() {
		public void run()
		{
			Singleton x = Singleton.getInstance();
		}
	});

	Thread t2 = new Thread(new Runnable() {
		public void run()
		{
			Singleton y = Singleton.getInstance();
		}
	});

	t1.start();
	t2.start();
 }
}

class Singleton {

    public static Singleton single_instance;
  
    // Constructor
    // Here we will be creating private constructor restricted to this class itself
    private Singleton()
    {
        System.out.printf("Hello I am a string part of Singleton class ");
    }
  
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance()
    {
        if(single_instance==null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}