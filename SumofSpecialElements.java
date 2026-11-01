public class SumofSpecialElements {
    

    static int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            try
            {
            if(n % nums[i] == 0 )
            {
                sum = sum + (nums[i] * nums[i]);
            }
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumOfSquares(arr));
    }
}
