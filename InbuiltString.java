public class InbuiltString
{

public static String stringTrim(String s)
{
    String result = s.trim();
    return result;
}

public static String[] stringSplit()
{
    String name = "praveen m";
    String[] result = name.split(" ");
    return result;
}

    public static void main(String[] args) {
        
        String s = "  praveen  ";
        System.out.println("before trim function call");
        System.out.println(s);
        System.out.println();
        System.out.println("after trim fuunction call");
        System.out.println(stringTrim(s));


        System.out.println("using split ");
        System.out.println();
        String[] arr = stringSplit();
        for(String i : arr)
        {
        System.out.println(i);
        }

        String name = "Programming";
        System.out.println("begin substring = "+ name.substring(3));


        System.out.println();
        System.out.println("begiin and end substring = "+name.substring(2,4));

        System.out.println();
        System.out.println("replace funcation "+name.replace('g','*'));
        
        String web = "www.google.com";
        System.out.println();
        System.out.println("bigining index of perticular character = "+ web.lastIndexOf('.'));
        System.out.println("from index of perticualr char index = " + web.lastIndexOf('.',4));

    }
}
