import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;

        int pivot = arr[low];

        while (i < j) {

            while (i < high && arr[i] <= pivot) {
                i++;
            }

            while (j > low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args) {

        int[] arr = {8, 4, 7, 2, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

       // System.out.println(Arrays.toString(arr));
       for(int i : arr)
       {
        System.out.print(i+ " ");
       }
         
    }
}