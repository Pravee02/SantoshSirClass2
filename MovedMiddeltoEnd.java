public class MovedMiddeltoEnd
{

    static void  movesMiddelTOEnd(int[] nums)
    {

        int left = nums.length/2-1;
        int right = nums.length/2;

        while(left >= 0 && right <= nums.length-1)
        {
            int temp = nums[left-1];
            nums[left-1] = nums[left];
            nums[left] = temp;
            left--;

            int temp1 = nums[right+1];
            nums[right+1] = nums[right];
            nums[right] = temp1;
            right++;
        }
        for(int i = 0 ; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
    }
    public static void main(String[] args)
    {
        
        int[] arr = { 5,8,3,6,9,7,1,2};
        movesMiddelTOEnd(arr);
    }
}