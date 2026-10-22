public class Recursion2 
{
    static void printNumbersDiffrentOrder(int n)
    {
    
        if(n >= 0)
        {
            if(n!=0){
                System.out.println(n);
            }
            printNumbersDiffrentOrder(n-1);
            System.out.println(n);
        }
        
    }

    static boolean result = true;
    static int i = 0;
    static int j = 0; 
    static int num = 0;
    static boolean isPalindrome(char[] numbers)
    {
        if(num ==0)
        {
            j = numbers.length-1;
            num++;
        }
        if( numbers[i] == numbers[j] && i < j)
        {
            i++;
            j--;
            isPalindrome(numbers);
        }
        else{
            return false;
        }
    
        return result;
    }

    static int index = 0;
    static int max = Integer.MIN_VALUE;
    static int returnMaxValue(int[] arr)
    {
        if(i < arr.length && arr[i] > max)
        {
            max = arr[i];
            i++;
            returnMaxValue(arr);
        }
        else if(i < arr.length)
        {
            i++;
            returnMaxValue(arr);
        }
        return max;
    } 

    static int count = 0;
    static int index1 = 0; 
    static int countCharacterAccurence(char[] arr)
    {
        if(index1 < arr.length && arr[index1] == 'a')
        {
            count++;
            index1++;
            countCharacterAccurence(arr);
        }
        else if(index1 < arr.length)
        {
            index1++;
            countCharacterAccurence(arr);
        }
        return count;
    }

    static int index2 = 0;
    static boolean checkArrayIsSorted(int[] arr)
    {

        if( index2 < arr.length-1 && arr[index2] > arr[index2+1])
        {
            return false;
        }
        else if(index2 < arr.length-1 )
        {
            index2++;
            return checkArrayIsSorted(arr);
        }
        return true;
    }


    static int indices = 0;
    static String removeChar(char[] arr) {
        if (indices == arr.length) {
            return "";
        }

        char ch = arr[indices];
        indices++;

        if (ch == 'r') {
            return removeChar(arr);
        }

        return ch + removeChar(arr);
    }


    public static void main(String[] args) 
    {
       // printNumbersDiffrentOrder(5);

    //    char[] arr = { 'a','b','a'};
    //    System.out.println(isPalindrome(arr));

    //    int[] arr1 = { 12, 45, 7, 89, 34, 21,100};
    //    System.out.println(returnMaxValue(arr1));

    //    char[] arr3 = {'a','b','a','c','a','d','b'};
    //    System.out.println(countCharacterAccurence(arr3));

        // int[] arr4 = {3,4, 8, 12, 19, 25, 31,1};
        // System.out.println(checkArrayIsSorted(arr4));


        char[] arr = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        System.out.println(removeChar(arr));

    }
}
