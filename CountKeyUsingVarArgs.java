public class CountKeyUsingVarArgs
{
    static int getCout(int key ,int...nums)
    {
        int count = 0;
        for(int i : nums)
        {
            if(key == i)
            {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        
        System.out.println(getCout(20, 20,10,20,30,20,40,20));
    }
}
