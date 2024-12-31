package Recursion;

public class FibonacciNumber {
    //base case fib(0) = 0 and fib(1) = 1
    //fibn = fibn-1 + fibn-1
    //fibn+2 = fibn+1 + fibn

    //call stack will be like from low to up it will go like branches where n-1 and n-2 runs and gets
    //and while coming down it adds up the branches values and returns it
    //and when two or more recursive functions are ran then the call stack can be represeneted as tree
    //time complexity is exponenetial coz we can see prottek ta level of tree te number of calls double hocche .
    //there for time complexity is O(2^n)
    
    public static int fib(int n){
        //base case >
        if(n==0 || n==1){
            return n;
        }
        int fib_nm1 = fib(n-1);
        int fib_nm2 = fib(n-2);
        return fib_nm1 + fib_nm2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println( + n + "th fibonnaci number is : " + fib(n));
    }
}
