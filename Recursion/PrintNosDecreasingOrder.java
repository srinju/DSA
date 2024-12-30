package Recursion;

public class PrintNosDecreasingOrder {
    
    //we can see that if we print the number and call thr function for n-1 then it will go ahead . 
    //but base case is when we reach 1 then we print n and return from there.
    //basically what happens is 10 is n
    //then the 10 gets printed as the sout statement
    //then the function runs n becomes n-1 and same shit happens
    //stack builds
    //reaches base case and stack stops
    //and when stack stops then it comes down erasing the stacks from the top

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
