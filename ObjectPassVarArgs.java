import java.applet.*;
import java.util.Scanner;
public class ObjectPassVarArgs
{
    static void getArryValues(Objects...values)
    {
        for (Objects student : values) {

            System.out.println("Student ID: " + student.id);
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Marks: " + student.marks);

            System.out.println("--------------------");
        }   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number students present in class");
        int num = sc.nextInt();

       
         Objects[] students = new Objects[num];
        for(int i = 0 ; i < num; i++)
        {
            System.out.println("enter new student id");
            int id = sc.nextInt();

            System.out.println("enter new student name");
            String name = sc.next();

           System.out.println("enter new student marks");
            int marks = sc.nextInt();

            students[i] = new Objects(id, name, marks);
        }

       
         getArryValues(students);

        sc.close();

    }


}
