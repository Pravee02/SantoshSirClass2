import java.util.*;

public class Age_1 {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age to check senior or not ");
        int age = sc.nextInt();
        if (age >= 60 && age <= 130) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Not a Senior Citizen");
        }
    }
}