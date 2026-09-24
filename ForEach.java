public class ForEach 
{

    static void printArr(int[]  nums)
    {
        for (int x : nums)  // for each syntax
    {
        System.out.println(x);
    }
    }
public static void main(String...args) {
    System.out.println(args[0]);
    int[] arr = {1 , 2, 3 , 5 , 5 , 8 , 7};
    printArr(arr);
    // printArr(new int[]{1 , 2, 3 , 5 , 5 , 8 , 7}); ananymous array
    

}    

}
