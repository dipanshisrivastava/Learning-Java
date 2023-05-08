import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample {
    public static void main(String[] args){   
    	
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(n);	
    	}
    }
}

