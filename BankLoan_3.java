
import java.util.*;

public class BankLoan_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age ");
        int age = sc.nextInt();
        System.out.println(" enter your salary ");
        int salary = sc.nextInt();

        if (age > 21 && salary >= 30_000) {
            System.out.println("Loan Approved");

        } else {
            System.out.println("Loan Rejected");
        }
    }
}
