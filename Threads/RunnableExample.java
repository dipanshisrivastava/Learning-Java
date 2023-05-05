class Z
{
	
}
// implementing Runnable instaed of exetnding thread beacuse we also want to extend class Z and multiple inheritance is not possible in java, therefore using interface Runnable.
// Runnable is a constructor in class thread.
class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try 
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try 
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableExample {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	Runnable obj1=new A();
    	Runnable obj2=new B();
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    }
    
}