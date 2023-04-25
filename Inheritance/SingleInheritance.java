//Class Person is inherited by class Student
class Person
{
    private int age;
    private String name;
    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return (age);
    }
    public String getName()
    {
        return (name);
    }
}
//class Student is inheriting class Person
class Student extends Person
{
    private int rollno;
    public void setRollno(int r)
    {
        rollno = r;
    }
    public int getRollno()
    {
        return (rollno);
    }
}
// driver class
public class SingleInheritance
{
	public static void main(String[] args) {
	    Student s1 = new Student();
	    s1.setRollno(100);
	    s1.setName("Riya");
	    s1.setAge(18);
	    System.out.println("Rollno: " + s1.getRollno());
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
	}
}
