public class LeetCode {
    static String reverseWords(String s) {
        
        char[] arr = s.toCharArray();
        int right = 0;
        int left = 0;
         
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                right = i - 1;
                while(left <= right)
                {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
        String result = new String(arr);
        return result;
    }
    public static void main(String[] args) {
        
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result);
    }
}

