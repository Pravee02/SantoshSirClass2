public class CountVowelsConsonents
{

    static int[] countVowelsConsonents(char[] arr)
    {
        int vowelsCount = 0;
        int consonentsCount = 0;

        if(arr == null)
        {
            return null;
        }
        else if(arr.length == 0)
        {
            return new int[] {0,0};
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
                arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') 
            {
                vowelsCount++;

            }
            else{
                consonentsCount++;
            }
        }
        return new int[] {vowelsCount,consonentsCount};
    }
    public static void main(String[] args)
    {
        //char[] arr = {'a','p','p','l','e'};
        char[] arr = null;
        int[] result = countVowelsConsonents( arr);
        if(result == null)
        {
            System.out.println("array is null");
        }
        else
        {
        for(int i : result)
        {
            System.out.print(i + " ");
        }
    
    }
    }
}
