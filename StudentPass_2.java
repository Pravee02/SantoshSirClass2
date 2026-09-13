import java.util.*;

public class StudentPass_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the marks you got in cs fundamentals");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("invalid marks enterd ");
        }

        else if (marks >= 35 && marks <= 100) {
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }

    }
}
