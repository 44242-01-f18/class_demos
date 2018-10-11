package com.company;

public class Main {
    // a^b = a * a^(b-1)
    //
    // calculates a to the power b
    public static int power(int a, int b)
    {
        if (b == 0) // base case
        {
            // don't worry about this, it's just to print the call stack
            for (int i=0; i<Thread.currentThread().getStackTrace().length; i++)
            {
                System.out.println(Thread.currentThread().getStackTrace()[i]);
            }
            return 1;
        }
        return a * power(a, b-1); //recursive step
    }
    public static int fib(int n)
    {
        // fib(n) == fib(n-1) + fib(n-2);

        if (n == 0)
            return 1;
        if (n == 1)
            return 2;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
