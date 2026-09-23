public class VarArgs
{
    static void show()
    {
        System.out.println("No Args");
    }

    static void show(int a)
    {
        System.out.println("one arg");
    }

    static void show(int a , int b)
    {
        System.out.println("Two args");
    }

    public static void main(String[] args)
    {
    
        show();
        show(15);
        show(15, 16);

    }
}
