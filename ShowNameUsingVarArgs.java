public class ShowNameUsingVarArgs 
{
    static void getMemberName(String...names)
    {
        for(String i : names)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        

        getMemberName("praveen","rohanth","bharath","manglore");
    }
}
