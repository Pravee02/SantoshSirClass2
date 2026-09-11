/* Method Overloading means:

 ->Same method name
 ->Same class
 ->Different parameters

Overloading depends on:

Number of parameters
Type of parameters
Order of parameters
*/

public class MethodOverloading {

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    float max(float x, float y) { // when int is not called this is called widening
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // max of three numbers
    int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return z;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.max(10, 20));

        System.out.println(obj.max(10, 20, 40));
    }
}