interface Computer
{
	 void code();
}

// Here Class Laptop is implementing interface Computer
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

// Here Class Desktop is implementing interface Computer
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
	public void devApp(Computer device)
	{
		device.code();
	}
}

public class Main {
    public static void main(String[] args) {
    
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer Riya=new Developer();
        Riya.devApp(lap);
        Riya.devApp(desk);
        
    }
}