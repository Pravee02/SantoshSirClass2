public class MainQueue {
    
    public static void main(String[] args) {
        
        QueueArray obj = new QueueArray(5);

        System.out.println("---------------");
        System.out.println("initially");
        System.out.println("---------------");
        System.out.println("displaying the queues elements");
        obj.display();

        System.out.println();
        System.out.println(" is empty "+obj.isEmpty());

        System.out.println();

        System.out.println(" -------------");
        System.out.println("enqueee");
        System.out.println("---------------");

        System.out.println();
        obj.enque(10);
        obj.enque(20);
        obj.enque(30);
        obj.enque(40);
        obj.enque(50);


        System.out.println();
        System.out.println("---- displaying the elemtns ------ ");
        obj.display();

        System.out.println();
        System.out.println("----- first element----");
        System.out.println(obj.first());

        System.out.println();
        System.out.println("------ last element------");
        System.out.println(obj.last());

        System.out.println();
        System.out.println("----dequee----");
        System.out.println( obj.deque());

        System.out.println();
        System.out.println(" ----- first number after queue------");
        System.out.println(obj.first());


        System.out.println();
        System.out.println("--------last after dequeue------");
        System.out.println(obj.last());


        System.out.println();
        System.out.println("------ deleteing remaining------");
        System.out.println( obj.deque());
        System.out.println( obj.deque());
        System.out.println( obj.deque());
        System.out.println( obj.deque());


        System.out.println();
        System.out.println("-------- displaying-------");
        obj.display();


        System.out.println();
        System.out.println(" is empty "+obj.isEmpty());

        System.out.println();
        System.out.println("----dequee----");
        System.out.println( obj.deque());


        System.out.println();
        System.out.println("----- first element----");
        System.out.println(obj.first());


        System.out.println();
        System.out.println("--------last after dequeue------");
        System.out.println(obj.last());



    }
}
