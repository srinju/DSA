package Recursion;

public class PrintSumOfNnaturalNos { //print sum of n natural numbers
    
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfN(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("ans is : " + sumOfN(n));
    }
}
