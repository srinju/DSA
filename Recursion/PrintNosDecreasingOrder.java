package Recursion;

public class PrintNosDecreasingOrder {
    //we can see that if we print the number and call thr function for n-1 then it will go ahead . 
    //but base case is when we reach 1 then we print n and return from there.

    public static void printDecreasingOrder(int n){
        if(n == 1){ //base case
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDecreasingOrder(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDecreasingOrder(n);
    }
}
