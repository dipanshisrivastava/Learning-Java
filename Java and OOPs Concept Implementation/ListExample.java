import java.util.ArrayList;
import java.util.List;

public class ListExample
{
    public static void main(String args[])
    {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // class "ArrayList" implements "Collection" interface.
        // Collection can not work with indices, ArrayList also implements "List" interface which can work with indices.
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(6);
        nums.add(4);
        nums.add(8);

        System.out.println(nums.get(1));

        System.out.println(nums.indexOf(4));

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
        // System.out.println(nums);

    }
}
