public class CountplusOne {
    
     static int[] plusOne(int[] digits) {
        int num = 0;
        for(int i = 0; i < digits.length; i++)
        {
            num = num * 10 + digits[i];
        }

        int original = num + 1;
        int num2 = original;

        int count = 0;
        while(num2 > 0)
        {
            num2 = num2 / 10;
            count++;
        }
        int[] result = new int[count];
        int i = result.length-1;
        
            while(i >= 0 && original > 0)
            {
                
                int digit = original % 10;
                result[i] = digit;
                original = original / 10;
                i--;
            }
        
    return result;

    }
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int[] result = plusOne(num);

        for(int i : result)
        {
            System.out.print(i);
        }
    }
}
