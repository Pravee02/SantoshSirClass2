import java.util.*;
public class LinearSearch
{

    static int linearSearch (int[] arr , int key)
    {
       
        if(arr.length == 0)
        {
            return -1;
        }

        else
        {
            for(int i = 0; i < arr.length ; i++)
            {
                if(arr[i] == key)
                {
                  
                    return i+1;
                    
                }
            }
    }
    return -1;
}
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements ");
        int n = sc.nextInt();

        System.out.println("enter the "+ n + " array elements ");
        int array[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("enter the key element to search ");
        int key = sc.nextInt();

    
        // int[] array = {10,20,30,40,50};
        // int key = 50;

        int result = linearSearch(array , key);

        if(result == -1)
        {
        System.out.println("element nod found ");
        
        }
        else
        {
            System.out.println("key found postion at "+ result);
        }
    }
}
