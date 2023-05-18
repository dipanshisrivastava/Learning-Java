import java.util.Set;
import java.util.TreeSet;

public class TreesetExample {
    public static void main(String args[])
    {
        // TreeSet is a class which implements "Set" interface.
        // HashSet is not sorted, neither gives the values in sequence.
        // "Treeset" class is used for sorted order.
        Set<Integer> nums = new TreeSet<Integer>();
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
