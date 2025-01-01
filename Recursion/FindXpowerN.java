package Recursion;

import java.util.Scanner;

public class FindXpowerN {
    //we have to find x^n using recursion
    //we know that x^n  = x * x^(n-1)
    public static int power(int x , int n){
        //base case is that if n is 0 then return the answer as 1
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number  : ");
        int x = sc.nextInt();
        System.out.print("Enter the power of that base number : ");
        int n = sc.nextInt();
        System.out.print("The answer is : " + power(x,n));
        sc.close();
    }
}
