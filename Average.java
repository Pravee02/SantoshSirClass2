public class Average
{
    int getAverage(int[] arr)
    {
        int sum = 0;
        for(int i : arr)
        {
            sum = sum+i;
        }
        int average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        
        Average obj = new Average();
        int[] arr = {1,2,5,6,8,9};
        System.out.println(obj.getAverage(arr));
    }
}
