public class TwoPointers
{
    static void printFromBothSides(int[] nums)
    {

        int left = 0;
        int right = nums.length - 1;

        while(left<=right)
        {
            System.out.print(nums[left] + " -> ");
            System.out.print(nums[right]);
            left++;
            right--; 
            System.out.println();

        }

        

    public static void main(String[] args)
    {
    
        int[] arr = { 1,2,3,4,5,6,7,8,9,10};

        printFromBothSides(arr);
    }
}
