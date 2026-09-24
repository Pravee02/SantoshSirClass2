public class PrintPrimeCLA
{

    public static void main(String[] args) // 1 2 3 4 5 6
    {
        for(String i : args)
        {
            int j = Integer.parseInt(i);
            int count = 0;
            for(int value = 1 ; value <=j ; value++ )
            {
                
                if( j % value == 0)
                {
                    count++;
                }

            }
       if(count == 2)
       {
        System.out.println(j);
       }


    }
}
}
