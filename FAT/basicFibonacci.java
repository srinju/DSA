package FAT;
import java.util.*;

public class basicFibonacci {
    
    public static int FibonacciTopDown(int n  , int[] memo) {
        if(n <= 1){
            return n;
        }

        if(memo[n] == 0){
            memo[n] = FibonacciTopDown(n-1 , memo) + FibonacciTopDown(n-2 , memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int[] memo = new int[n + 1];
        int result = FibonacciTopDown(n , memo);
        System.out.println("fib (" + n + ") = " + result);
    }
}
