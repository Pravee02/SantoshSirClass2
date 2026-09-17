import java.util.*;
public class AverageCallSum_13 {


    static int sum(int a, int b, int c) {
        
        return a+b+c;
    }

    static int average(int a , int b, int c) {
        return sum(a, b, c)/3;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

            System.out.print("Enter a number: ");
        int b = sc.nextInt();

            System.out.print("Enter a number: ");
        int c = sc.nextInt();
       

       
        int result = average(a,b,c);

        System.out.println("average is  "+result);
    }
}
    


    

