import java.util.*;
public class PassStudent
{

    static int countPassedStudents(int[] arr){
        if(arr == null||arr.length == 0 )
        {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 35 && arr[i] <= 100)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number of stuednts");
        // int n = sc.nextInt();

        // int[] marks = new int[n];
        // System.out.println("enter the marks of each students");
        // for(int i = 0; i < n; i++)
        // {
        //      marks[i] = sc.nextInt();
        // }

        int[] marks = null;
        
        System.out.println(countPassedStudents(marks));
    }
}