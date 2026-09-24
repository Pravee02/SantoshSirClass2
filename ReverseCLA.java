public class ReverseCLA
{
    
    public static void main(String[] args)
    {
        for(int i = args.length-1; i >= 0 ; i--)
        {
            System.out.println(args[i]);
        }

        for(int i = 0 ; i < args.length ; i++)
        {
            System.out.println(args[i]);
        }
    }
}
