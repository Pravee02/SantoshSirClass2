public class BracketBalance 
{

    int top = -1;
    char[] arr;
    int size;
    BracketBalance(int n)
    {
        this.size = n;
        arr = new char[n];
    }

    public  boolean isBalanced(String equation)
    {
        boolean result = true;
        for(int i = 0; i < equation.length();i++)
        {
            char ch = equation.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                push(ch);
            }
            else if(ch ==')' && top > -1 && arr[top] == '(' )5
            {
                pop();
            }
            else if(ch =='}' && top > -1 && arr[top] == '{' )
            {
                pop();
            }
            else if(ch ==']' && top > -1 && arr[top] == '[' )
            {
                pop();
            }
            else if(ch == ')' || ch == '}' || ch == ']')
                {
                    result = false;
                }
        }
        if(top >-1)
        {
            result = false;
        }
        
        return result;
    }
    public void push(char value)
    {
        if(top == size-1)
        {
            System.out.println("stack is full");
        }
        else{
            top++;
            arr[top] = value;
        }
    }
    public int pop()
    {
        if(top == -1)
        {
            return -1000;
        }
    
        char value = arr[top];  // CHANGED
        top--;                    // CHANGED
        return value;   
    }

    public static void main(String[] args) {
        
        String s = " {[(])}";
        BracketBalance obj = new BracketBalance(10);
        boolean result = obj.isBalanced(s);
        System.out.println(result);
    }
}
