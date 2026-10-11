public class BubbleSort
{
    static void bubbleSort(int[] arr)
    {
        if(arr.length == 1)
        return;

        boolean stop = false;
        do
        {
            stop = false;
            for(int i = 0; i < arr.length-1 ; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    stop = true;
                }
            }
        } 
        while(stop == true);
    }

    static void printArray(int[] arr)
    {
        if(arr == null)
        {
            return;
        }
        else
        {
            for(int i : arr)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        //int[] arr = {8,9,5,5,7,56,6,1,2,3};
        int[] arr = null;
        
        
       

        System.out.println("befor sorting");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("after soritng");
        printArray(arr);
        

    }
    
}