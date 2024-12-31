package Recursion;

public class FibonacciNumber {
    //base case fib(0) = 0 and fib(1) = 1
    //fibn = fibn-1 + fibn-1
    //fibn+2 = fibn+1 + fibn
    
    public static int fib(int n){
        //base case >
        if(n==0 || n==1){
            return n;
        }
        int fib_nm1 = fib(n-1);
        int fib_nm2 = fib(n-2);
        int fib_n = fib_nm1 + fib_nm2;
        return fib_n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println( + n + "th fibonnaci number is : " + fib(n));
    }
}
