public class ThirdLargest
{
    static int thirdLargest(int[] arr)
    {
        int largest = 0;
        int secondlargest = 0;
        int thirdlaargest =0;
        for(int i : arr)
        {
            if(i>largest)
            {
                thirdlaargest = secondlargest; 
                secondlargest = largest;
            
                largest = i;
            }
        }
        return thirdlaargest;
    } 
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,8,9,10};
        System.out.println(thirdLargest(arr));

    }
}