public class TwoDArray
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];

        int n = 1;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
               a[i][j] = n;
               n++;
            }
            System.out.println();
        }

        // printing the 2d array
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // checking the length of 2D array 
       System.out.println(a.length);
       System.out.println(a[0].length);

       // creating another 2d array
       int b[][] = {{1,0,0} , {0,1,0} , { 0,0,1}};

       // just declaring 2d array
       int c[][] = new int[a.length][a[0].length];


       // adding 2d  2 arrays 
       for(int i = 0; i < a.length; i++)
       {
        for(int j = 0; j < a[i].length; j++)
        {
            c[i][j] = a[i][j] + b[i][j];
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
       }

       // printing added 2d array
       System.out.println();
       for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int[] x : c)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}