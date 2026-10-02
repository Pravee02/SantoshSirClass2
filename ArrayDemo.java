public class ArrayDemo
{

    public static void main(String[] args)
    {
    
        MyArry obj = new MyArry();

        System.out.println("initial array");
        obj.printArray();

        System.out.println("after inserting 3 elements from end ");
        obj.inserAtEnd(10);
        obj.inserAtEnd(20);
        obj.inserAtEnd(30);
        obj.inserAtEnd(40);
        obj.inserAtEnd(50);

        obj.printArray();

        System.out.println("delete from end ");
        obj.deleteFromEnd();
        obj.printArray();

        System.out.println("delete from start");
        obj.deleteFromStart();
        obj.printArray();

        // System.out.println("after inserting at start one element  ");
        // obj.inserAtStart(1000);
        // obj.printArray();


        // System.out.println("after inserting at position  one element  ");
        // obj.inserAtPosition(2 , 5000);
        // obj.printArray();


        // System.out.println("after inserting at wrong position   ");
        // obj.inserAtPosition(10 , 5000);
        // obj.inserAtStart( 5000);

        
        

        }
}
