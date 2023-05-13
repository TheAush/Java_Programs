import java.util.*;

public class fibonacci {
    private static long[] fibCache;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number : ");
        int n= sc.nextInt();
        fibCache = new long[n+1];
        fib(n);
        for(int i=0;i<=n;i++) {
            System.out.print(fib(i) + " ");
        }
    }
    private static long fib(int n) {
        if(n<=1)
            return (n);
        if (fibCache[n] !=0) {
        return fibCache[n];
        }
            long nthFibonacciNumber = (fib(n-1)+ fib(n-2));
            fibCache[n] = nthFibonacciNumber;
            return nthFibonacciNumber;
        }
    }