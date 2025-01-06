package Backtracking;

public class GridWays {
    
    //PROBLEM STATEMENT>

    //Find number of ways to reach from (0,0) to (n-1 , m-1) in a n*m grid . 
    //Allowed moves is right or down

    //APPROACH>>

    //we can see that all the places have two kind of moves right or down except the most right ones on each row which has only down move and the most left bottom one which has only right move and no down move
    //we can see we will take one way and recursively do it for the other places 
    //and then backtrack the ways to the previous ways after removing the recent path
    //obv before removing recent path it should get printed as a base case

    //we can visualise it like this man .. like see if we move right by one unit then see then from the new posn to the destination .. it isa new map to cover
    //like that for the same if we move one unit down
    //so we can say that from (x,y+1) (horizontal ways) and (x+1,y) (vertical ways) we add those then we get the total ways

    //f(x) = f(x+1,y) + f(y+1,x)
    //base case >> if source == n-1,m-1 then number of ways = 1.

    public static int countWays(int i , int j , int n , int m ){

        //base case>
        if(i==n-1 && j == m-1){
            return 1;
        } else if(i==n || j == n){
            return 0;
        }
        int way1 = countWays(i+1, j, n, m); //total right movement ways
        int way2 = countWays(i, j+1, n, m); //total down movement ways
        return way1 + way2; //total number of ways
    }

    public static void main(String[] args) {
        int n = 3 , m  = 3;
        System.out.println(countWays(0, 0, n, m));
    }

}
