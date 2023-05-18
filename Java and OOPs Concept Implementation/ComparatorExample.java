import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample
{
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<>();

        // Comparator is a functional interface(has only one method i.e compare).
        // Comparator is used when one needs to specify their own logic of sorting. 
        /*
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j)
            {
                if(i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };
        */

        // Since Comparator is a functional interface, lambda expression can be used here.
        Comparator<Integer> comp = (i, j) -> i%10 > j%10? 1:-1;
    
        nums.add(43);
        nums.add(64);
        nums.add(49);
        nums.add(27);
        nums.add(38);

        // Default sorting
        // Collections.sort(nums);
        Collections.sort(nums, comp);

        System.out.println(nums);
    }
}
