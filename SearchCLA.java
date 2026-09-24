public class SearchCLA
{
    
    public static void main(String[] args)
    {
    int target = 2 ;
        for(String i : args)
        {
            if(target == Integer.parseInt(i)) 
            {
                System.out.println(" yes present ");
            }
        }
    }
}
