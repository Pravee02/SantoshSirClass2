public class greater 
{

    public static void main(String[] args)
    {
        int[] arr = { 1,1,4,2,1,3};
        int index = 0;
        int value = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > value)
            {
                value = arr[i];
                index = i;
            }
        }
        System.out.println(index + " "+ value);
    }
}
