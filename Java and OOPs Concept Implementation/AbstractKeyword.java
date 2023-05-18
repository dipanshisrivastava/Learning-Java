abstract class Car
{
    // public void drive()
    // {
    // don't know what to do in drive, better declare a method not define.
    // }
    abstract public void drive();
    public void playMusic()
    {
        System.out.println("Play Music");
    }
}
// It's important to define all the abstract methods of the parent class.
class WagonR extends Car
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class AbstractKeyword
{
    public static void main(String args[])
    {
        Car obj = new WagonR ();
        obj.drive();
        obj.playMusic();
    }
}
