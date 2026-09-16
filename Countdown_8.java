import java.util.*;

public class Countdown_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
