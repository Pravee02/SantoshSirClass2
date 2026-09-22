public class PositiveNegativeZeors
{
     void getCountOfArray(Object array)
    {
        for(int i : array.arr)
        {
            if(i < 0)
            {
                array.negetiveCount++;
            }
            else if(i>0)
            {
                array.positiveCount++;
            }
            else
            {
                array.zeroesCount++;
            }
        }
        
    }
    public static void main(String[] args) {
        
        Object obj = new Object();

         obj.arr[0] = 1;
         obj.arr[1] = 2;
         obj.arr[2] = 0;
         obj.arr[3] = -5;
         obj.arr[4] = 10;
         obj.arr[5] = 1;
         obj.arr[6] = 0;
         obj.arr[7] = -5;
        PositiveNegativeZeors obj1 = new PositiveNegativeZeors();

        obj1.getCountOfArray(obj);
        System.out.println("negeive counts are " +obj.negetiveCount);
        System.out.println("positive counts are " +obj.positiveCount);
        System.out.println("Zeroes counts are " +obj.zeroesCount);

       }
}
