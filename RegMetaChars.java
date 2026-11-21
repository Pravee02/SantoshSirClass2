public class RegMetaChars 
{

    public static void demoMatchOneDigit()
    {
        String a = "8";
        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
        System.out.println();

    }

    // 2  matches one word char
    public static void demoOneWordMatch()
    {
        System.out.println("A".matches("\\W"));
        System.out.println("9".matches("\\W"));
        System.out.println("@".matches("\\W"));
        System.out.println("_".matches("\\W"));
        System.out.println();

    } 
    // 3 \D --- non digit matching 
    public static void demoNonDigitMatch()
    {
        System.out.println("A".matches("\\D"));
        System.out.println("5".matches("\\D"));
        System.out.println();
    }

    // 4.matches one hit space char
    public static void demoOnceSpace()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
        System.out.println();

    }

    //5. matches any no space character
    public static void demoNonSpaceChar()
    {
        System.out.println("A".matches("\\S"));
        System.out.println(" ".matches("\\S"));
        System.out.println();
    }

    //6. matches special character (non word character)

    public static void demoNonWordChar()
    {
        System.out.println("@".matches("\\W"));
        System.out.println("#".matches("\\W"));
        System.out.println("A".matches("\\W"));
        System.out.println();
    }

    // tells how many chars to match
    // 1.  start quantifiers --0 or more

    public static void demoStartQuant()
    {
        String s1 = "abcbbaaac";
        String s2 = "";
        String s3 = "abc7";
        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
        System.out.println();
    }

    //2 plus (+) -- check for one or more

    public static void demoPlusQuant()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";

        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
        System.out.println();
    }

    // 3 excat count ({3})
    public static void demoExactCount()
    {
        String s1 = "acc";
        String s2 = "ab";
        String s3 = "abcd";
        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abcd]{4}"));
        System.out.println();
    }

    //4 {min,max} -- check within range
    public static void demoMinMaxQuant()
    {
        String s1 = "abccba";
        String s2 = "ab";
        String s3 = "abccbaa";

        System.out.println(s1.matches("[abc]{3,7}"));
        System.out.println(s2.matches("[abc]{3,7}"));
        System.out.println(s3.matches("[abc]{3,7}"));
        System.out.println();
    }

    //5 check for 0 and 1
    public static void demoQuestMarkQuant()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";
        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("ab?c"));

        System.out.println(s3.matches("abb?c"));
 
        
    }
    public static void main(String[] args) {
        

        demoMatchOneDigit();
        demoOneWordMatch();
        demoNonDigitMatch();
        demoOnceSpace();
        demoNonSpaceChar();
        demoNonWordChar();


        // quantifiers
        System.out.println("quantifiers");
        demoStartQuant();
        demoPlusQuant();
        demoExactCount();
        demoMinMaxQuant();
        demoQuestMarkQuant();
    }
}
