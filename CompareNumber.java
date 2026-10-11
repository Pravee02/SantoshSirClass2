public class CompareNumber
{
    static void compareElementWithArray(int[] arr , int element)
    {

        if(arr == null)
            {
                System.out.println("array is null");
                 return;
            }
        else  if(arr.length == 0)
            {
                System.out.println("array is empty");
                return;
            }
            

        for(int i = 0; i < arr.length; i++)
        {
          
             if(element > arr[i])
            {
            System.out.println(element +"  > " +arr[i]);
            }

            else if(element < arr[i])
            {
            System.out.println(element +"  < " +arr[i]);
            }
            
            else
            {
            System.out.println(element +"  == " +arr[i]);
            }

        }
    }
    public static void main(String[] args)
    {
        int[] nums = {10,20,-50,80};
        //int[] nums = null;
        //int[] nums = new int[0];
        int element = 30;
        compareElementWithArray(nums , element);
    }
}