public class String1 {
    public static void main(String[] args) {
        String s1 = new String("praveen"); // s1 holds refrence of String pool adress or actual object of head adress ?
        String s2 = "praveen";
        String s3 = new String("praveen");
        String s4 = "praveen";

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s4); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s4)); // true

    }
}
