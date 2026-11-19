public class StringProblms 
{

    public int getCountOfSpecialChars(char[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length;i++)
        {
            if(!(arr[i] >= 'A' && arr[i] <= 'Z') && !(arr[i] >= '0' && arr[i] <= '9') && !(arr[i] >= 'a' && arr[i] <= 'z'))
            {
                count++;
            }

            // if(!((arr[i] >= 'A' && arr[i] <= 'Z')
            // || (arr[i] >= '0' && arr[i] <= '9') 
            // || (arr[i] >= 'a' && arr[i] <= 'z')))
            // {
            //     count++;
            // }
        }
        return count;
    }


    static char[] replaceOwelsWithStar(char[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            char l = arr[i];
            if(l == 'a' || l == 'e' || l =='i' || l=='o'|| l == 'u'
            ||l == 'A' || l == 'E' || l =='I' || l=='O'|| l == 'U')
            {
                arr[i] = '*';
            }
        }
        return arr;

    }

    
    public static int countAccurence(char[] arr)
    {
        int count = 0;
        int target = 'A';
        for(int i =0 ; i < arr.length;i++)
        {
            if(arr[i] == target)
            {
                count++;
            }
        }
        return count;
    } 

    static char largestChar(String name)
    {
        char[]arr = name.toCharArray();
        char largest = name.charAt(0);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }

        }
        return largest;
    }

    static String stringReverse(String name)
    {
        String result ="";
        for(int i = name.length()-1 ; i >= 0; i--)
        {
            result = result + name.charAt(i) ;
        }
    }

    public static void main(String[] args) {
        
        char[] arr = {'a' ,'2','1','@' , '#','%','Z'};
        StringProblms obj = new StringProblms();
        int result = obj.getCountOfSpecialChars(arr);
        System.out.println(result);

        char[] arr1 = {'J' ,'A','V','A'};
        System.out.println(countAccurence(arr1));


        String name = "praveen";
        char ans = largestChar(name);
        System.out.println(ans);

        char[] arr2 = {'p','r','a','v','e','e','n'};
        char[] star = replaceOwelsWithStar(arr2);
        System.out.println(star);
    }
}
