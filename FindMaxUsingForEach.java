public class FindMaxUsingForEach
{

    static int getMaxValue(int[] nums)
    {
        int max = 0;
        for(int i : nums)
        {
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
    
        int[] arr = {1,2,3,4,5,8};
        System.out.println(getMaxValue(arr));
    }
}
