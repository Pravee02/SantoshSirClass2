import java.util.*;

public class SearchFirstMatch_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array elements ");
        int n = sc.nextInt();
        System.out.println("enter " + n + " elements ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target element");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.println("element found at index " + i);
            }
        }

    }
}
