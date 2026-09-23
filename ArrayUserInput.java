import java.util.*;
public class ArrayUserInput
{

    
    void display(int[] arr)
    {
        System.out.println("the elements are");
        for( int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args)
    {

        ArrayUserInput obj = new ArrayUserInput();
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter array elements");

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        obj.display(a);


    }
}
