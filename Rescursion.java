public class Rescursion
{
    public static void fun(int n)
    {
        if(n > 0)
        {
            System.out.print(n + " ");
            fun(n-1);
        
        }
    }
    
    public static void fun1(int n)
    {
        if(n > 0)
        { 
            System.out.println("enter " + n);
            fun1(n-1);
            System.out.println("exit " +n);
        }
    }
    public static void main(String[] args)
    {
        //fun(3);
        System.out.println();
        fun1(3);
    }
}