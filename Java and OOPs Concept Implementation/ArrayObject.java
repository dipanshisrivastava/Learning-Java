class Student
{
    int rollno;
    String name;
    int marks;
}
public class ArrayObject {
    public static void main(String args[])
    {
        
        Student s1 = new Student();
        s1.rollno = 23;
        s1.name = "Astha";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 33;
        s2.name = "Disha";
        s2.marks = 84;

        Student s3 = new Student();
        s3.rollno = 42;
        s3.name = "Riya";
        s3.marks = 81;

        // Creating Array of Student
        Student Students[] = new Student[3];
        
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for(int i=0; i<Students.length; i++)
        {
            System.out.println(Students[i].name + " " + Students[i].marks);
        }
    }
}
