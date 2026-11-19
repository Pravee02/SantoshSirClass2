public class Regex
{

    public static void main(String[] args) 
    {
        //regex dot 
        //do not matches any character except new line 
        String text = "XZ";
        System.out.println(text.matches("."));
        
        //[abc]
        System.out.println(text.matches("[abc]"));

        //[abc][vz]
        System.out.println(text.matches("[abc][vz]"));

        //[^abc]
        System.out.println(text.matches("[^abc]"));

        //[a-z1-7]
        System.out.println(text.matches("[a-z1-7]"));

        //a/b
        System.out.println(text.matches("A|B"));

        //XZ
        System.out.println(text.matches("XZ"));

    }
}
