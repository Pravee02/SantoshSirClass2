import java.util.Arrays;

public class TwoSum
{

     public static int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length-1;
        int mid = left + (right - left) / 2;
        while(left < right){
          
            if(left == mid )
            {
                mid++;
            }
            else if(numbers[left]+numbers[mid] == target){
                return new int[]{left+1,mid+1} ;
            }
            else if(numbers[right]+numbers[mid] == target)
            {
               return new int[]{mid+1,right+1} ;
            }
            else if (numbers[left]+numbers[mid] < target){
                mid++;
                left++;
            }
            else{
                mid--;
                
            }
           
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int arr[] = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(twoSum(arr, target)));    }
    
}
