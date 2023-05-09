import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


class Student implements Comparable<Student>
{
	int age;
	String name;
	
	public Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}
	
	public int compareTo(Student that)
	{
		if(this.age >that.age)
			return 1;
		else
			return -1;
	}
}
	

public class ComparableForNonDefinedClass {
    public static void main(String[] args){   

     	
    	List<Student> studs= new ArrayList<>();
    	studs.add(new Student(21,"Navin"));
    	studs.add(new Student(12,"John"));
    	studs.add(new Student(18,"Parul"));
    	studs.add(new Student(20,"Kiran"));
    	
    	Collections.sort(studs);
    	for(Student s: studs)
    		System.out.println(s);
    }
}

