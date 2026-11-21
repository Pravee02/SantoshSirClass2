public class StringBuilderBufferMethods {
    public static void main(String[] args) {
        
        //String buffer
        StringBuffer sb1 = new StringBuffer("praveen");
        StringBuffer sb2 = sb1;

        sb1.append("m");
        System.out.println(sb2);
        System.out.println(sb1.capacity());
        
        //String builder
        StringBuilder sB = new StringBuilder("hi");
        System.out.println(sB.capacity());
    }
}
