import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students>
{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }



    public int compareTo(Students that)
    {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableExample
{
    public static void main(String args[])
    {
    
        List<Students> studs = new ArrayList<>();

        studs.add(new Students(32, "Naveen"));
        studs.add(new Students(48, "Harsh"));
        studs.add(new Students(63, "Riya"));
        studs.add(new Students(85, "Aarya"));

        // Collections.sort(num); ----> Default sort works for integers because it is implemented "Comparable interface" and Integer class implements "Comparable interface",
        //  to use it for "students" class we explicitly needs to implement "Comparable interface".
        // "Comparable interface" is a functional interface which has "compareTo()" method.
        // We need to implement the required logic in "compareTo()" method.
        Collections.sort(studs);

        for(Students s : studs)
            System.out.println(s);
    }
}

