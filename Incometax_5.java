import java.util.*;

public class Incometax_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you salary more than 20k");
        int salary = sc.nextInt();
       // int tax = 0;
        if (salary < 20_000) {
            System.out.println("no income tax ");
        } else {
           int tax = 20*salary/100;
            System.out.println(tax);
        }

    }
}
