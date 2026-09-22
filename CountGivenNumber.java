public class CountGivenNumber
{

    int getCountOfNumber(int[] nums , int target)
    {
        int count = 0;
        for(int i : nums)
        {
            if(target == i)
            {
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        
        CountGivenNumber obj = new CountGivenNumber();
        int[] arr = {1,0,2,5,6,5,5,2,11,5,3,2,5,2,9,5};
        int target = 5;
       System.out.println(obj.getCountOfNumber(arr,target));
    }
}
