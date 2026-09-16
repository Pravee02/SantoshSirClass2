import java.util.*;

public class PowerUsingMethod_11 {
    static int result = 1;
    // static int original = base;

    static void power(int base, int exponent) {
        while (exponent > 0) {
            result = result * base;
            exponent--;
        }
        System.out.println("the answer was " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base value ");
        int base = sc.nextInt();
        System.out.println("enter the exponent ");
        int exponent = sc.nextInt();
        power(base, exponent);
    }
}