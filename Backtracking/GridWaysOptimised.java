package Backtracking;

public class GridWaysOptimised {
    
    //here is a more optimised solution to the grid ways code in linear time
    //we can see that we are moving right and down 
    //sometimes it is RRDD OR DRDD OR DRRD OR DDRR ...etc ...etc
    //that means there are R-1 charecters and D-1 charecters
    //and we are finding the permutations of those n-1 + m-1 charecters
    //in permutations formula we know we do (n-1 + m-1)!/(n-1)!*(m-1)! .... the dinominator are the identical elements

    //how do we do factorial --> 4 --> 4*3*2*1


    public static int gridWays(int n , int m){ //O(n)
        //base case >
        if(n==0 || m ==0){
            return 0;
        }
        //kaam>
        int numerator = factorial((n-1+m-1));
        int dinominator = factorial(n-1) * factorial(m-1);

        int result = numerator/dinominator;

        return result;
    }

    public static int factorial(int n){
        //base case for factorial>
        if(n==1 || n==0){
            return 1;
        }
        //kaam>
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 3 , m = 3;
        System.out.println("the number of ways from source to destination is : " + gridWays(n,m));
    }

}
