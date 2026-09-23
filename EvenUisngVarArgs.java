public class EvenUisngVarArgs
{

    static int getEvenCount(int...arr)
        {
            int count = 0;
            for(int x : arr)
            {
                if(x %2 ==0)
                {
                    count +=1;
                }
            }
            return count;
        }
    public static void main(String[] args) {
        

       System.out.println(getEvenCount(1,2,5,6));
    }
}
