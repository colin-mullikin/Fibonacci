package com.gohealth.fibonacci;

/**
 * @author <a href="mailto:cmullikin@gohealth.com">Colin Mullikin</a>
 */
public class Fibonacci {

    public static int fib(int n){
        return (n < 1) ? 0 : (n < 3) ? 1 : fib(n-1) + fib(n-2);
    }

}
