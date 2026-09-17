import java.util.*;
public class StudentResultSystem_17 {
    
    
    static int total(int a, int b, int c)
    {
        int totalmarks = a+b+c;
        return totalmarks;
    }

    static int percentage(int a, int b, int c)
    {
        int percentage = total(a, b, c)*100/300;
        return percentage;
    }
    static int grade(int a, int b, int c)
    {
        int percent = percentage(a,b,c);

        if(percent>=50 && percent<60)
        {
             return 6;
        }
        else if(percent>=60 &&percent<70)
        {
            return 7;
        }

        else if(percent>=70 && percent<80)
        {
            return 8;
        }

        else if(percent>=80 && percent<90)
        {
            return 9;
        }

        else if(percent>=90 && percent<=100)
        {
            return 10;
        }
        else{
            return 0;
        }
       
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a marks1 ");
        int m1 = sc.nextInt();
         
        System.out.println("enter a marks2 ");
        int m2 = sc.nextInt();
         
        System.out.println("enter a marks1 ");
        int m3 = sc.nextInt();

        int totalMarks = total(m1, m2, m3);
        System.out.println("total marks is "+totalMarks);

        int percent = percentage(m1, m2, m3);
        System.out.println("percentagae is "+percent);

        int grads = grade(m1,m2,m3);
        System.out.println("the grade was "+grads);
    }
}
