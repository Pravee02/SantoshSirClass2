import java.util.*;
public class BinarySearch
{
    static int binarySearch(int[] arr , int target)
    {
        // edge case 1: null
        if(arr == null)
        {
            return -1;
        }
        if(arr.length == 0)
        {
            return -1;
        }

        int leftIndex = 0 ;
        int rightIndex = arr.length-1;

        while(leftIndex <= rightIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex / 2) ;

            if(arr[midIndex] == target)
            {
                return midIndex;
            }

            else if(arr[midIndex] > target)
            {
                rightIndex = midIndex-1;
            }

            else
            {
                leftIndex = midIndex + 1;
            }
        }
        return -1;
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("enter the " + n + " array elements ");
        for(int i = 0; i < n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target element to find the index");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        System.out.println(" the target found at index " +result);
        
    }
}
