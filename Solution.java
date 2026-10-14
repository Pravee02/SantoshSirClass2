// class Solution {
//     static int heightChecker(int[] heights)
//     {
//         int count = 0;
         
//         for(int i = 0; i < heights.length-1;i++)
//         {
//             int pointer = 0;
            
//             int index = 0;
//             int value = Integer.MIN_VALUE;
//             for(int z = i; z < heights.length; z++)
//             {
//                 if(heights[z] > value)
//                 {
//                     value = heights[z];
//                     index = z;
//                 }
//             }
//             for(int j = i+1 ; j < heights.length ; j++)
//             {
                
                
//                 if(heights[i] > heights[j])
//                 {
//                     if(heights[j] <= value )
//                     {
//                         value = heights[j];
//                         index = j;
//                         pointer++;
//                     }
//                 }
//                 if(j == heights.length-1 && pointer > 0)
//                 {
//                     int temp = heights[i];
//                     heights[i] = heights[index];
//                     heights[index] = temp;
//                     count++;
//                 }
//             }

//         }
//         return count;
//     }

//     public static void main(String[] args)
//     {
    
//         int[]arr = {1,1,4,2,1,3};
//         System.out.println(heightChecker( arr));
//     }
// }




class Solution {
    static int findMaxConsecutiveOnes(int[] nums)
    {
        int count = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++)
        {
            
            if(nums[i] == 1)
            {
                counter++;
                if(i == nums.length-1 && count < counter)
                {
                   
                    count = counter;
                }
            }
            else if(nums[i] != 1 && count <= counter)
            {
                count = counter;
                counter = 0;
            }

            else if(nums[i] != 1)
            {
                counter = 0;
            }   

            
        }
        return count;
    }

    public static void main(String[] args) {
            int[] nums = {1, 1, 0, 1, 0, 1, 1};

            System.out.println(findMaxConsecutiveOnes(nums));
    }
}