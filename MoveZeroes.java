public class MoveZeroes 
{
    static void movesZeroes(int[] nums)
    {
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++)
        {
            if(nums[j] != 0)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++; 
                
            }
            
        }
    
    }
    public static void main(String[] args)
    {

        int arr[] = {0, 1,0, 2 ,0,0,0,8,0};
        movesZeroes(arr);

        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
