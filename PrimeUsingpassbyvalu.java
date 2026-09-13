import java.util.Scanner;

class PrimeUsingpassbyvalue {
    boolean prime(int num) {
        boolean result = false;
        for (int i = 1; i < num / 2; i++) {
            if (num % 2 == 0) {
                result = false;
                return result;

            } else {
                result = true;
                return result;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check primeornot");
        int a = sc.nextInt();
        PrimeUsingpassbyvalue obj = new PrimeUsingpassbyvalue();
        boolean result = obj.prime(a);
        System.out.println(result);
    }
}