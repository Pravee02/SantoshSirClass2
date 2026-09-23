public class VarArgs
{
    // static void show()
    // {
    //     System.out.println("No Args");
    // }

    // static void show(int a)
    // {
    //     System.out.println("one arg");
    // }

    // static void show(int a , int b)
    // {
    //     System.out.println("Two args");
    // }

    static void show(int...a)
    {
        System.out.println("Arguments");
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
    {
    
      //  show();
        show(15);
        show(15, 16);
        show(15,16,17,18,19); //show(new int[]{15,16,17,18,19})

    }
}
