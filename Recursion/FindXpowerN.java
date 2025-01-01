package Recursion;

import java.util.Scanner;

public class FindXpowerN {
    //we have to find x^n using recursion
    //we know that x^n  = x * x^(n-1)
    public static int power(int x , int n){ //not optimiesed O(n)
        //base case is that if n is 0 then return the answer as 1
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static int OptimisedPower(int x , int  n){ //time complexity in this approach is O_(logn) as the powers are getting half in every step
        //we see that if the n is even then 2^10 is 2^5 * 2^5
        //and if we see that if the n is odd then 2^5 = 2 * 2^2 * 2^2 therefore x * x^n-1 * x^n-1
        //base case >
        if(n == 0){
            return 1;
        }
        int halfPowerEven = OptimisedPower(x , n/2);
        int halfPowerSquare = halfPowerEven * halfPowerEven;
        if(n%2 == 0){ //even power
            return halfPowerSquare;
        } else { //odd power
            return x*halfPowerSquare;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number  : ");
        int x = sc.nextInt();
        System.out.print("Enter the power of that base number : ");
        int n = sc.nextInt();
        System.out.print("The answer with simple power function is  : " + power(x,n));
        System.out.println("The answer with Optimised power function is  : " + power(x,n));
        sc.close();
    }
}
