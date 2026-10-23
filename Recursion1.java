public class Recursion1 
{
    
    static void fun(int n)
    {
        if(n > 0)
        {
            System.out.println("enter " + n);
            fun(n-1);
            System.out.println("exit " +n);
            
        }
    }

    static void fun1(int i)
    {
        if(i > 5)
        {
            return;
        }
        System.out.print(i + " ");
        fun1(i+1);
    }

    static void fun2(int i)
    {
        if(i == 0){
            return;
        }
        System.out.print(i + " ");
        fun2(i-1);
    }

    static int count = 0;
    static void funcount(int n)
    {
        if(n == 0)
        {
            System.out.println(count);
            return;
        }
        count++;
        funcount(n-1);
    }

    static int sum;
    static void sumOfNnumber(int n)
    {
        if(n == 0)
        {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumOfNnumber(n - 1);

    }
    static long fact = 1;
    static long factorial(int n)
    {
        // if(n > 0)
        // {
        //     fact = fact * n;
        //     factorial(n-1);
        // }
        
        // return fact;

    
    if (n == 0) 
        return 1;
    return n * factorial(n - 1);
}

    

    static int power = 1;
    static void poweOfNumbers(int base, int expo)
    {
        if(expo == 0)
        {
            System.out.println(power);
            return;
        }
        power = power * base;
        poweOfNumbers(base, expo-1);
    }

    static int totalSum ;
    static int sumOfDigits(int num)
    {
        if(num > 0)
        {
            int digit = num % 10;
            totalSum = totalSum + digit;
            sumOfDigits(num / 10);
        }
        return totalSum;
    }

    static int reverse = 0;
    static int reverseNumber(int num)
    {
        if(num > 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            reverseNumber(num / 10);
        }
        return reverse;
    }
    public static void main(String[] args) {
        //fun(3);

        //fun1(1);

        //fun2(100);

        //funcount(100);

        //sumOfNnumber(10);

        System.out.println(factorial(5));

        //poweOfNumbers(2,5);

        //System.out.println(sumOfDigits(256));

        //System.out.println(reverseNumber(1234));
    }
}