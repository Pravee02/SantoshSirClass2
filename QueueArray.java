public class QueueArray {
    
    int size;
    int front;
    int rear;
    int[] queue;

    QueueArray(int size)
    {
        this.size = size;
        rear  =-1;
        front = -1;
        queue = new int[size];
    }

    public void enque(int value)
    {
        if(isFull())
        {
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    //deque
    public int deque()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }

        front++;
        int value = queue[front];
        return value; 
    }
    public boolean isEmpty()
    {
        return front == rear;
    }

    public boolean isFull()
    {
        return rear == size - 1;
    }

    public int first()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        return queue[front + 1];
    }

    public int last()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }

        return queue[rear];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("the queue is empty");
        }

        for(int i = front + 1 ; i <= rear; i++)
        {
            System.out.println(queue[i]);
            System.out.println("_________");
        }
    }



}
