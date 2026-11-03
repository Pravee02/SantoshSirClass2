public class TwoDArray2 
{

    static void printElement(int[][] arr)
    {
    
        for(int rows = 0; rows < arr.length; rows++)
        {
            for(int col = 0 ; col < arr[rows].length; col++)
            {
                System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
    }
    static void print(int[][] arr)
    {
        for(int rows = 0; rows < arr.length; rows++)
        {
            for(int col = 0 ; col < arr[rows].length; col++)
                {
                    System.out.print(arr[rows][col] + " ");
                }
                System.out.println();
        }
    } 
    public static void printRow(int[][] arr,int rowNumber)
    {
        
        for(int rows = rowNumber-1; rows < rowNumber ; rows++)
        {
            for(int col = 0; col < arr[rows].length;col++)
            {
                System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
    }

    public static void printRows(int[][] arr,int rowNumber)
    {
        if(arr == null)
        {
            return;
        }
        if(rowNumber <= 0 || rowNumber > arr.length)
        {
            System.out.println("invalid row number");
            return;
        }
      
        for(int col=0 ; col < arr[rowNumber-1].length; col++)
        {
            System.out.print(arr[rowNumber-1][col]+" ");
        }
        System.out.println();

    }

    static void printColoumns(int[][] arr , int colNum)
    {
        if(arr == null)
        {
            return;
        }
        
        for(int row = 0; row < arr.length;row++)
        {
            if(colNum > arr[row].length)
            {
                System.out.println("NA");
                
            }
            else{
            System.out.println(arr[row][colNum-1]);
            }
        }
    }

    static void leftDiagnal(int[][] arr)
    {
        if(arr == null)
        {
            return;
        }
        //int col = 0;
        // for(int row = 0; row < arr.length;row++)
        // {
        //     if(col > arr[row].length)
        //     {
        //         System.out.println("NA");
        //     }
        //     else{
        //     System.out.println(arr[row][col]);
        //     col++;
        //     }
        // }

        for(int row = 0; row <arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(row == col)
                {
                    System.out.print(arr[row][col]+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void rightDiagnal(int[][] arr)
    {
        if(arr == null)
        {
            return;
        }
       
        int actualCols = arr[0].length-1;
        for(int row = 0; row < arr.length;row++)
        {
            
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(col == actualCols)
                {
                    System.out.print(arr[row][col]+ " ");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
            actualCols--;
            System.out.println();
        }
    }

    static void diagnalsFromBothSides(int[][] arr)
    {
        if(arr == null)
        {
            return;
        }
        int leftcol = 0;
        int rightcol = arr[0].length-1;
        int count = 0;

        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0 ; col <arr[row].length;col++)
            {
                if(col == leftcol)
                {
                    System.out.print(arr[row][leftcol]+" ");
                    
                }
                else if(col == rightcol)
                {
                    System.out.print(arr[row][rightcol]+"  ");
                }
                else
                {
                    System.out.print("   ");
                }
              
            }
            System.out.println();
            if( leftcol < rightcol&&count == 0){
            leftcol++;
            rightcol--;
            }
            else if(leftcol==rightcol || count!=0)
            {
                leftcol--;
                rightcol++;
                count++;
            }
            
        }
    }


    public static void main(String[] args) {
        //int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
       // printElement(arr); 

        int[][] arr1 = {{11,12,13,14,15},
                        {21,22,23,24,25},
                        {31,32,33,34,35},
                        {41,42,43,44,45},
                        {51,52,53,54,55}};
        //print(arr1);

        //System.out.println();
        //printRow(arr1,1);

        // System.out.println();
        // printRows( arr1,2);

        // System.out.println();
        // printColoumns(arr1,3);

        System.out.println();
        rightDiagnal(arr1);

        System.out.println();
        leftDiagnal(arr1);

        System.out.println();
        diagnalsFromBothSides(arr1);
    }
}
