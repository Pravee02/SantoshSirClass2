public class EvenDigitCount 
{
//Given an array nums of integers, return how many of them contain an even number of digits.
//Example 1:
//Input: nums = [12,345,2,6,7896]
    static int evenDitiCount(int[] arr)
    {
        if(arr == null)
        {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            int digit = 0;
            while(num > 0 || num < 0)
            {
                num = num/10;
                digit++;
            }
            if(digit % 2 ==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] arr = {12,345,2,6,7896,-5686};
       // int[] arr = {555,901,482,1771,-1234};
        System.out.println(evenDitiCount(arr));
    }
}
