import java.util.*;
public class LargestCallMaxtwice_16 {
    

    static int max(int a, int b){
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }

    static int largest(int a, int b, int c)
        {
            int firstmax = max(a,b);
            int result = max(firstmax,c);
            return result;
        }
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter first number ");
        int b = sc.nextInt();
        System.out.println("enter first number ");
        int c = sc.nextInt();

        int result = largest(a,b,c);
        System.out.println(result);
        
    }
}
