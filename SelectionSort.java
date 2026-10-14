public class SelectionSort
{
    static void selectionSort(int[] arr)
    {
        
        for(int i = 0 ; i < arr.length-1; i++)
        {
            int minvalue = arr[i];
            int minindex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < minvalue)
                {
                    minvalue = arr[j];
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = minvalue;
            arr[minindex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 9,2,16,6,13};
        selectionSort(arr);
        for(int i : arr)
        {
            System.out.println(i);
        }
        
    }
}