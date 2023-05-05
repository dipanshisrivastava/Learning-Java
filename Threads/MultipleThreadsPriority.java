// Check the output, it shows that threads run parallelly with a break.

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=500;i++)
		{
			System.out.println("Hi");
			try 
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=500;i++)
		{
			System.out.println("Hello");
			try 
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class MultipleThreadsPriority {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	// Printing the priority of obj1 (Range: 1-10) given by scheduler.
    	System.out.println(obj1.getPriority());
    	
    	obj1.start();
    	// Trying to give break of 2 miliseconds to scheduler so that both threads cannot go to scheduler simultaneously.
    	try 
    	{
			Thread.sleep(2);
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
    	obj2.start();
    }
    
}