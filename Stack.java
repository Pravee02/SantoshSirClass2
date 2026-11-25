public class Stack {
    private int size;
    private int top;
    private int[] stack;

    Stack(int size)
    {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    // is stack empty or not 
    public boolean isEmpty()
    {
        return top == -1;
    }

    // is stack full or not
    public boolean isFull()
    {
        return top == size -1;
    }
    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("stack full");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " inserted into a stack");
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("the stacl is empty");
            return -1;
        }

        int value = stack[top];
        top--;
        System.out.println(value + " poped");
        return value;
    }

    public int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        return stack[top];
    }

    //peep()
    int peep(int position )
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        int index = top - position + 1;
        return stack[index];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return;
        }
        for(int i = 0; i <= top ; i++)
        {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Stack obj = new Stack(10);

        // stack empty or not 
        System.out.println("is tack empty or not ");
        System.out.println(obj.isEmpty());


        // is stack full or not
        System.out.println();
        System.out.println("is stack full ");
        System.out.println(obj.isFull());

        // push element to stack 
        System.out.println();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        // pop
        System.out.println();
        obj.pop();

        // stack of top 
        System.out.println();
        System.out.println("stack of top element ");
        System.out.println(obj.stackTop());

        // peep()
        System.out.println();
        System.out.println("stack of perticualr position element ");
        System.out.println(obj.peep(2));


        //display
        System.out.println();
        System.out.println("all stack elements");
        obj.display();


    }
}
