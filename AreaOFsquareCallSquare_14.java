import java.util.*;
public class AreaOFsquareCallSquare_14 {

static int square(int side) {
        return side * side;
    }

    static int areaOfSquare(int side) {
        return square(side);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        int side = sc.nextInt();

        int result = areaOfSquare(side);

        System.out.println("Area of square = " + result);
    }
    
}
