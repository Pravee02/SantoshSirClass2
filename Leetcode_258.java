public class Leetcode_258
{

    static long addDigits(long num) {
        long sum = 0;  // 11
        while(num > 0)
        {
            long digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        if(sum >= 0 && sum <= 9)
        {
            return sum;
        }
        else
        {
           return  addDigits(sum);
           
        }
        
        
    }

    

    public static void main(String[] args)
    {
        long num = 38;
        long result = addDigits(num);
        System.out.println(result);
    }
}
