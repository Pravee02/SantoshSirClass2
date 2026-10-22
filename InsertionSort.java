public class InsertionSort
{
    static void insertionSort(int[] arr)
    {
        if(arr == null || arr.length == 1)
        {
            return;
        }

        for(int i = 1 ; i < arr.length ; i++)
        {
            int key = arr[i];
            int left = i - 1;

            while(left >= 0 && key < arr[left])
            {
                arr[left+1] = arr[left];
                
                left--;
            }
            arr[left + 1] = key;
        }
        
    }
        public static void main(String[] args) {
            
            int[] arr = {8,7,6,5,4};
            insertionSort(arr);
            for(int i : arr)
            {
                System.out.print(i+ " ");
            }
        }
}
