public class ArrayMain
{
    public static void main(String args[])
    {
        // Method 1: 1D array:

        /*
        int nums[] = new int[4];

        nums[0] = 5;
        nums[1] = 3;
        nums[2] = 1;
        nums[3] = 6;
        */

        // Method 2: 1D array:

        /*
         int nums[] = {3,6,8,2};
        */
        
        /*
         for(int i=0; i<nums.length; i++)
            System.out.print(nums[i] + " ");
        */
         

        // 2D Array:
        /*
        int nums[][] = new int[3][3];

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[0].length; j++)
            {
                // Using Math.random() to assign random values.
                // Math.random() returns double value, convert it into int. 
                //Math.random() returns value between 0 to 1, So multipling it by 10 to get value greater then 1.  
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[0].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Jagged Array
        // A jagged array is an array whose elements are arrays, possibly of different sizes. 

        int nums[][] = new int[3][];

        nums[0] = new int[4];
        nums[1] = new int[2];
        nums[2] = new int[3];

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}