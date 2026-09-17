 import java.util.Scanner;
public class CubeCallSquare_12 {


    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return square(n) * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = cube(n);

        System.out.println(result);
    }
}
    

