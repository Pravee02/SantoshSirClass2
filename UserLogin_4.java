import java.util.*;

public class UserLogin_4 {

    public static void main(String[] args) {
        String name1 = "admin";
        String pas = "java123";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the user name");
        String name = sc.nextLine();

        System.out.println("enter the user name");
        String pass = sc.nextLine();

        if (name.equals(name1) && pas.equals(pass)) {
            System.out.println("Login Succesfull");

        }

        else {
            System.out.println("Login failed");
        }

    }
}
