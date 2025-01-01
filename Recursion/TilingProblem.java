package Recursion;

public class TilingProblem {

    //PROBLEM STATEMENT >

    //given a 2 * n board where 2 is the breadth and n is the length of the borad
    //and given tiles of size 2 * 1 , count the number of ways to tile the given board
    //using 2 * 1 tiles
    //a tile can either be placed horizontally or vertically

    //APPROACH >

    //we can analyse and see that whenver the n is equal to 1 or the n is 0 then the number of ways are 1 
    //and whenevre we are placing a tile then we have two possiblities one is vertically and one is horizontally
    //if we place one tile vertically in a 2*n board then we can see that only 2*n-1 part is left , on the rest of the part we can apply recursion
    //and if we place on tile horizontally then or tolaio hirozontally bosatei hbe and the rest remains as 2*n-2 part of the board and we can apply recursion for the rest of that part
    //and hence we can say that the total number of ways will be the sum of the recursive part of both the vertical and horizontal choices 
    //which is total number of ways = f(n-1) + f(n-2)

    public static int TotalWays(int n) { // 2 * n (floor size)
        //base case >>
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice >
        int f_nm1 = TotalWays(n-1);
        //horizontal choice >
        int f_nm2 = TotalWays(n-2);
        int totalWays = f_nm1 + f_nm2;
        //return the total number of ways
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4 ; //thereforre 2 * 3 table size
        System.out.println("the total number of ways to place tiles in the 2 * " + n + " table is : " + TotalWays(n));
    }
}
