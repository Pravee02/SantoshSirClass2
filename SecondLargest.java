public class SecondLargest 
{

    static int secondLargst(int[] arr)
    {
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > firstLargest)
            {

                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] <firstLargest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;

    }
    public static void main(String[] args) 
    {
        int arr[] ={ 6 ,12 ,35 ,1 ,10 ,34 ,1 };
        int result = secondLargst(arr);
        System.out.println(result);

        
    }
}
