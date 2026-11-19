public class LeetCode1 {
    
    static  int strStr(String haystack, String needle) {
    //     int count = 0;
    //     int j = 0;
    //     int index = -1;
    //     for(int i = 0; i < haystack.length();i++)
    //     {
    //         if(j == needle.length())
    //         {
    //             j = 0;
    //         }
    //         if(haystack.charAt(i) == needle.charAt(j))
    //         {
              
    //             if(count == 0)
    //             {
    //                 index = i;
    //             }

    //             count++;

    //             if(count == needle.length())
    //             {
    //                 return index;
    //             }
    //             if(count != 0)
    //             {
    //             j++;
    //             }

    //         }
    //         else
    //         {
    //             count = 0;
    //             j=0;
    //         }
    //     }
    //     return -1;

       haystack = haystack.replaceFirst(needle , "*");
       for(int i = 0; i < haystack.length();i++)
       {
        if(haystack.charAt(i) == '*')
        {
            return i;
        }
       }
       return -1;

     }
    public static void main(String[] args) {
        
        String s1 = "mississippi";
        String s2 = "issip";
        System.out.println(strStr(s1, s2));
    }
}

