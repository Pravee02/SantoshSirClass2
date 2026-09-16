import java.util.*;;

public class Vowel_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character to check vowel or not");
        char letter = sc.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Ovewl");
        } else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Ovewl");
        } else {
            System.out.println("Consonant ");
        }
    }
}
