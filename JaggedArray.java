public class JaggedArray 
{

    public static void main(String[] args) 
    {
    
        int A[][];
        A = new int[3][];

        A[0] = new int[5];
        A[1] = new int[3];
        A[2] = new int[8];

        int a = 1;
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                A[i][j] = a;
                System.out.print(A[i][j] + " ");
                a++;
            }
            System.out.println();
        }


    }
}
