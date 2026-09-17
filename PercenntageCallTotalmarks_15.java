import java.util.Scanner;

public class PercenntageCallTotalmarks_15 {

    static int totalMarks(int a , int b , int c , int d , int e) {
        return a+b+c+d+e;
    }

    static int percentage(int a , int b , int c , int d , int e) {
        return totalMarks(a,b,c,d,e) * 100 / 500;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a marks: ");
        int a = sc.nextInt();
        System.out.print("Enter the b marks: ");
        int b = sc.nextInt();
        System.out.print("Enter the c marks: ");
        int c = sc.nextInt();
        System.out.print("Enter the d marks: ");
        int d = sc.nextInt();
        System.out.print("Enter the e marks: ");
        int e = sc.nextInt();

        int result = percentage(a,b,c,d,e);

        System.out.println("Percentage is  = " + result);
    }
    
}
