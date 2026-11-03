public class TwoDArray3 {
    static int getSumOfMatrix(int[][] arr)
    {
        int sum = 0;
        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                sum = sum + arr[row][col];
            }
        }
        return sum;
    }

    static int getMaxElementInMatrix(int[][] arr)
    {
        int max = arr[0][0];

        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(arr[row][col] > max)
                max = arr[row][col];
            }
        }
        return max;
    }

    static int getMinValInMatrix(int[][] arr)
    {
        int minVal = arr[0][0];
        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(arr[row][col] < minVal)
                minVal = arr[row][col];
            }
        }
        return minVal;

    }

    static int[] getEvenOddCount(int[][] arr)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(arr[row][col] %2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
        }
        return new int[]{oddCount,evenCount};
        
    }

    static boolean isKeyPresent(int[][] arr, int key)
    {
        boolean result = false;

        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(arr[row][col] == key);
                result = true;
                break;
            }
        }
        return result;

    }

    static int[][] scalarMultiplication(int[][] arr,int scalar)
    {
        
        int[][] newArray = new int[arr.length][arr[0].length];

        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                int mul = arr[row][col] * scalar;
                newArray[row][col] = mul;
            }
        }
        return newArray;
    }

    static int getSumOfEvenElements(int[][] arr)
    {
        if(arr == null)
        {
            return 0;
        }
        int sumOfEven = 0;
    
        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[row].length;col++)
            {
                if(arr[row][col] %2 == 0)
                {
                    sumOfEven = sumOfEven + arr[row][col] ;
                }
            }
        }
        return sumOfEven;
    }

    static int[] getSumOfEachRow(int[][] arr)
    {
        if(arr == null)
        {
            return null;
        }
        int[] newArr = new int[arr[0].length];
        for(int row = 0; row < arr.length;row++)
        {
            int rowSum = 0;
            for(int col = 0 ; col < arr[row].length;col++)
            {
                rowSum = rowSum + arr[row][col];
                newArr[row] = rowSum; 
            }
        }
        return newArr;
    }


    static int[] getSumOfEachColl(int[][] arr)
    {
        if(arr == null)
        {
            return null;
        }
        int[] newArr = new int[arr[0].length];
        for(int row = 0; row < arr[0].length;row++)
        {
            int colSum = 0;
            for(int col = 0 ; col < arr.length;col++)
            {
                colSum = colSum + arr[col][row];
                newArr[row] = colSum; 
            }
        }
        return newArr;
    }

    static int getSumGreater50(int[][] arr)
    {
        if(arr == null)
        {
            return 0;
        }
        int sum = 0;
        for(int row = 0; row < arr.length;row++)
        {
            for(int col = 0 ; col < arr[0].length;col++)
            {
                if(arr[row][col] > 50)
                    sum = sum + arr[row][col];
            }
        }
        return sum;
    }

    static int[] getMaxInEveryRow(int[][] arr){
        if(arr == null)
        {
            return null;
        }
        int[] newArray = new int[arr.length];
        for(int row = 0; row < arr.length;row++)
        {
            int max = arr[row][0];
            for(int col = 0 ; col < arr[0].length;col++)
            {
                if(arr[row][col] > max)
                    max = arr[row][col];

            }
            newArray[row] = max;
        }
        return newArray;

    }

    public static void main(String[] args) {
        
        int[][] arr = {{3,5,9},
                       {7,6,2},
                       {4,8,1}
                       };
        
        int[][] arr1 = {{30,50,90},
                       {70,60,20},
                       {40,8,1}
                       };
        // sum of all elements
        System.out.println("the sum of all elements in matrix was ");
        System.out.println(getSumOfMatrix(arr));


        //max element in array
        System.out.println();
        int result = getMaxElementInMatrix(arr);
        System.out.println("the maximum element in matrix was");
        System.out.println(result);


        //min value in array
        System.out.println();
        int minResult = getMinValInMatrix(arr);
        System.out.println("minimum val in matrix was");
        System.out.println(minResult);



        //odd and even count in array
        System.out.println();
        int[] evvenoddcountresult = getEvenOddCount(arr);
        System.out.println("odd count : "+evvenoddcountresult[0] ); 
        System.out.println("even count : " + evvenoddcountresult[1]);


        //searching elemnt in array is present or not
        System.out.println();
        boolean keyresult = isKeyPresent(arr, 8);
        if(keyresult)
        {
            System.out.println("element is present");
        }
        else{
            System.out.println("element is not present");
        }


        //scalar multiplication
        System.out.println();
        int[][] scalar= scalarMultiplication(arr,2);
        for(int row[] : scalar)
        {
            for(int col : row)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }


        //sum of all even elements in array
        System.out.println();
        System.out.println("sum of all even number are ");
        System.out.println(getSumOfEvenElements(arr));

        // sum of each row
        System.out.println();
        System.out.println("sum of all each row ");
        int[] rowResult = getSumOfEachRow(arr);
        for(int x : rowResult)
        {
            System.out.println(x);
        }


        // sum of each columns
        System.out.println();
        System.out.println("sum of each column was ");
        int[] colresult = getSumOfEachColl(arr);
        for(int x : colresult)
        {
            System.out.print(x + " ");
        }

        //sum of all elements that are greater than 50
        System.out.println();
        System.out.println("the sum of elements greater than 50 was");
        System.out.println(getSumGreater50(arr1));

        
        // maximum element in every row
        System.out.println();
        System.out.println("maximun element every row");
        int[] maxresult = getMaxInEveryRow(arr);
        for(int x: maxresult)
        {
            System.out.println(x);
        }
}
}