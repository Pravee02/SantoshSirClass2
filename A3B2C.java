public class A3B2C 
{
    public static char[] expansion(String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '1' && s.charAt(i) <= '9')
            {
                count += s.charAt(i) - '0';
                count--;
            }
            else{
                count++;
            }
        }

        char[] arr = new char[count];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        { 
            boolean flag = false;
            if(s.charAt(j) >= '1' && s.charAt(j) <= '9')
            {
                int num = s.charAt(j) - '0';
                num = num-1;
                flag = true;
                while(num > 0)
                {
                    arr[i] = arr[i-1];
                    i++;
                    num--;
                }
            }
            
            else{
                arr[i] = s.charAt(j);
            }
            if(flag == true)
            {
                i--;
            }
            j++;
        }
        return arr; 

    }
    public static void main(String[] args) {
        String s = "a5b1c3";
        char[] arr = expansion(s);
        System.out.println(arr);

    }
}
