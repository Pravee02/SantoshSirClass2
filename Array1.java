public class Array1
{
    
    public static void main(String[] args)
    {
    
        int arr[] = { 1,2,6,5,8};
      // int arr[] = new int[5];
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
        //System.out.println(arr[-1]);   error


        System.out.println();

       for(int i = 0; i < arr.length ; i++)
       {
        System.out.println(arr[i]);
       }
    }
}
