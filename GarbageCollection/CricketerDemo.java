class Cricketer{
    Cricketer(){
        System.out.println("Object is created");
    }
    // finalize function is written in Object class as protected void finalize(){  }
    protected void finalize(){
        System.out.println("Object is destroyed");
    }
}
public class CricketerDemo
{
	public static void main(String[] args) {
	    
	    // First Object Creation
		Cricketer c = new Cricketer();
		
		// 1. Destroying memory by assigning a null
		c = null;
		
	    // Second Object Creation
		Cricketer c1 = new Cricketer();
		
	    // Third Object Creation
		Cricketer c2 = new Cricketer();
		
		// 2. Destroying memory by assigning reference to another
		c1 = c2;
		
		// 3. Destroying memory by anonymous object
		new Cricketer();
		
		// System.gc(): is used to call the finalize function just before the object is destroyed.
		System.gc();
	}
}
