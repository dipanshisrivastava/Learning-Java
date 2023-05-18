import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

// "Iterable" is a interface imlemented by "Collection" interface, which can work with iterators, it has "interator" method which gives iterator object. 

public class IteratorExample {
    public static void main(String args[])
    {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(21);
        nums.add(6);
        nums.add(4);
        nums.add(8);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
    }
}