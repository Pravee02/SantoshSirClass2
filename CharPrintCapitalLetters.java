public class CharPrintCapitalLetters
{
    static char[] printCapitalLetterArray(char[] arr)
    {
        if(arr == null)
        {
            return null;
        }
        char[] newArray = new char[arr.length];
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] > 'a' && arr[i] < 'z')
            {
                newArray[i] = (char) (arr[i] -32);
            }
            else{
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) 
    {
        char[] arr = {'c','o','d','e'};
        char array[] = printCapitalLetterArray(arr);
        System.out.print(" [ ");
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] );
            if(i<array.length-1)
            {
                System.out.print(" , ");
            }
        }
         System.out.print("] ");

    }
}
