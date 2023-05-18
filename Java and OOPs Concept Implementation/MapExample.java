import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String args[])
    {
        // HashTable can be used when you are working with multiple threads, it is same as HashMap but synchronized. 
        // Map <String, Integer> students = new HashTable<>();
        Map <String, Integer> students = new HashMap<>();

        students.put("Riya", 56);
        students.put("Harsh", 6);
        students.put("Naveen", 59);
        students.put("Aarya", 66);
        // keys are not repeated(keys are set) and values can be repeated(keys are list).
        students.put("Harsh", 45);

        // System.out.println(students);
        // System.out.println(students.get("Harsh"));

        for(String key: students.keySet())
        {
            System.out.println(key + " " + students.get(key));
        }

    }
}
