import java.util.HashSet;
import java.util.Set;

public class HashsetExample
{
    public static void main(String args[])
    {
        // HashSet is a class which implements "Set" interface.
        // HashSet is not sorted, neither gives the values in sequence.
        // "Treeset" class is used for sorted order.
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(21);
        nums.add(6);
        nums.add(4);
        nums.add(8);

        System.out.println(nums);

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}