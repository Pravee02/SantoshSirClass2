public class ReverseCopyStoreAnotherArray {

    static int[] reverseArrat(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return null;
        }
        int[] result = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i >= 0; i--)
        {
            result[j] = arr[i];
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
            int[] arr = { 1,2,3,4};
            int[] result = reverseArrat(arr);
            
            for(int i : result)
            {
                System.out.print(i + " ");
            }
    }
}
