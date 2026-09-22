public class SeconfLargest
{
   int  getSecondLargest (int[] arr){

    int largest = 0;
    int secondlargest =0;
    for(int i : arr)
    {
        if(i>largest)
        {
            secondlargest = largest;
            largest = i;
            
        }
    }
    return secondlargest;
   }
    public static void main(String[] args) {
        SeconfLargest obj = new SeconfLargest();
        int[] arr = {1,5,6,8,9,7,10};
        System.out.println(obj.getSecondLargest(arr));
    }
}
