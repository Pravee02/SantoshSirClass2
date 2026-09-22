public class DivisibleBy3
{
    int getCountDivisibleByThree(int[] nums)
    {
        int count = 0;
        for(int i: nums)
        {
            if(i%3== 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
    
        DivisibleBy3 obj = new DivisibleBy3();
        int[] arr = { 3,6,9,5,8,6,18,5,4};
        System.out.println(obj.getCountDivisibleByThree(arr));
    }
}
