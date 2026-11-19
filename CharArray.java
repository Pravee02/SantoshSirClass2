public class CharArray {
    public static void main(String[] args) {
         char[] arr = { 'P','R','A','V','E','E','N'};
        // System.out.println(arr);

        // Integer[] array = { 1,2,3,4};
        // System.out.println(array);

        // String name = "PRAVEEN ";
        // String emoji =  "👏";
        // System.out.println(name);
        // System.out.println(emoji.length()); // number of UTF - 16 code points(unicode transfermative formate)
        // System.out.println(emoji);


        // A to B
        char ch = 'A';
        System.out.println((char)(ch+1));
        

        // B to A
        char ch1 = 'B';
        System.out.println((char)(ch1-1));


        //small to big and big to small
        char small = 'a';
        System.out.println((char)(small-32));

        char big = 'A';
        System.out.println((char)(big + 32));

        //print char at even indexes using char[] array
        for(int i =0 ; i < arr.length; i++)
        {
            if(i % 2 == 0){
                System.out.print(arr[i] +" ");
            }
        }

        //printing char at even iindexes using string 
        System.out.println();
        String s = "praveen";
        for(int i =0 ; i < s.length(); i++)
        {
            if(i % 2 != 0){
                System.out.print(s.charAt(i));
            }
        }

        // print middle value 
        System.out.println();
        String m = "praveen";
        //String m = "praveena";

        if(m.length() % 2 != 0)
        {
            System.out.println(m.charAt(m.length()/2));
        }
        else
        {
            System.out.println(m.charAt(m.length()/2-1) + " "+ m.charAt(m.length()/2));
        }

        //print middle element for char[] arr

        char[] num = {'j','a','v','a'};
        if(num.length % 2 != 0)
        {
            System.out.println(num[num.length / 2]);
        }
        else
        {
            System.out.println(num[num.length/2-1] + " "+ num[num.length/2]);
        }
       


    }
}
