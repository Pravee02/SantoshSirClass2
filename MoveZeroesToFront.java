public class MoveZeroesToFront
{
    static void moveZeroesToFront(int[] arr)
    {
        int j = arr.length-1;
        for(int i = arr.length-1; i >=0; i--)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        } 
    }
    public static void main(String[] args)
    {
        int[] arr = {5,8,0,9,0,8,0,9};
        moveZeroesToFront(arr);
        for(int i : arr)
        {
            System.out.print(i+ " ");
        }
    }
}