public class SearchUsingForEach
{
    static boolean isElementPresent(int[] nums , int key)
    {
        boolean result = false;
        for(int i : nums)
        {
            if(i == key)
            {
                result = true;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {10 , 20 , 30 , 40 , 50,100}; 
        int target = 30;
        int target2 = 1000;
        System.out.println(isElementPresent(arr,target));
         System.out.println(isElementPresent(arr,target2));
    }
}