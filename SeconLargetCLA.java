public class SeconLargetCLA
{

    public static void main(String[] args)
    {
        int largest = 0;
        int seconglargest = 0;
        for(String i : args)
        {
            int j = Integer.parseInt(i);
            if(j > largest)
            {
                seconglargest = largest;
                largest = j;
            }

        }
        System.out.println(seconglargest);
    }
}
