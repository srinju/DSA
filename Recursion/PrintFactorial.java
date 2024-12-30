package Recursion;

public class PrintFactorial {

    //factorial formula is : f(n) = n*f(n-1);
    //that means we make a function where the number multiplies it's lower value
    
    public static int factorial(int n){
        //base case >
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }
}
