import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample
{
    public static void main(String args[])
    {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
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