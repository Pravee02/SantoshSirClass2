public class NameAgeCityCLA
{

    public static void main(String[] args)   // ["kiran" ,"praveen" ,"21", "30"] 
    {
    int add =0;
        for(String i : args)
        {
            System.out.println(i);
            add += Integer.parseInt(i);
        }
        System.out.println(add);
    }
}
