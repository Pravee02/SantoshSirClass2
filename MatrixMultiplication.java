public class MatrixMultiplication {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
            
        };

        int[][] b = {
            {1, 2},
            {5, 6}
        };

        int[][] result = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < b.length; k++) {
                    int first = a[i][k] ;
                    int second = b[k][j];
                    result[i][j] += first * second;
                }
            }
        }

        // Printing result
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}