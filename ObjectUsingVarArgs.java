import java.applet.*;
import java.util.Scanner;
public class ObjectUsingVarArgs
{
    static void getArryValues(Objects...values)
    {
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number students present in class");
        int num = sc.nextInt();

        Objects obj = new Objects();
        for(int i = 0 ; i < num; i++)
        {
            System.out.println("enter new student id");
            obj.id = sc.nextInt();

            System.out.println("enter new student name");
            obj.name = sc.next();

           System.out.println("enter new student marks");
            obj.marks = sc.nextInt();
        }

        getArryValues(obj);
        
    }

}
