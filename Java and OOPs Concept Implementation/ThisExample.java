class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
}
public class ThisExample
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Riya");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
} 