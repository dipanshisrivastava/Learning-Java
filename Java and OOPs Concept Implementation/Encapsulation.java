class Human
{
    private int age;
    private String name;

    public void SetAge(int a)
    {
        age = a;
    }
    public void SetName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class Encapsulation
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.SetAge(22);
        obj.SetName("Astha");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }    
}
