public class SumUsingForEach
{

    static int findSum(int[] nums)
    {
        int sum = 0;
        for(int x : nums)
        {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,3,5,7}; 

        System.out.println(findSum(arr));

    }
}
