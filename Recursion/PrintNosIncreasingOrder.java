package Recursion;

public class PrintNosIncreasingOrder {
    
    //here it is the opposite of print decreasing 
    //coz we are running the function first then print the n
    //that means the n value decreases
    //and runs until reaches 1 and when 1 it prints 1
    //and then comes down the stack and as the function already ran
    //while coming down the stack and erasing the above
    //it prints the n that appears on its way down
    //so 1 to 10 increasing order gets printed

    public static void PrintIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        PrintIncreasing(n);
    }
}
