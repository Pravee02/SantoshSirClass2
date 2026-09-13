import java.util.*;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first matric  rows numbers");
        int rows = sc.nextInt();

        System.out.println("enter the first matric  columns numbers");

        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        System.out.println("enter the second matric  rows numbers");
        int rows2 = sc.nextInt();

        System.out.println("enter the second matric  columns numbers");

        int cols2 = sc.nextInt();

        int[][] arr2 = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
