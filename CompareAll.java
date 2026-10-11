public class CompareAll
{
    static void compare(int[] arr)
    {
        if(arr == null)
        {
            return;
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            j = 0;
            System.out.println();
        while(j < arr.length)
        {
            
            if( i == j)
            {
                j++;
            }
            else
            {
            if(arr[i] == arr[j])
            {
                System.out.println(arr[i] + " == " +arr[j]);
            }
            else if( arr[i] > arr[j])
            {
                System.out.println(arr[i]+ " > " + arr[j]);
            }
            else
            {
                System.out.println(arr[i]+ "<" +arr[j]);
            }
            j++;
            }
        }
        }
        }
    public static void main(String[] args)
    {

        int[] arr = { 5,4,5,2,8};
        compare(arr);

        
    }
}
