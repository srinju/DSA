package Backtracking;

public class NQueens {
    
    //place N queeens on an N*N chessboard such that no 2 queens can attack each other
    //below is a safe sketch where no queens can attack each other for a 4*4 board

    /*

    0  1  2  3  // Column indices
    0  .  .  Q  .  // Row 0
    1  Q  .  .  .  // Row 1
    2  .  .  .  Q  // Row 2
    3  .  Q  .  .  // Row 3
    
    */

    //APPORACH >>

    //we can find all the solutiona and from theire if there is some solution then we can return any one of them
    //queens can move vertical , horizontal and diagonal
    //when queen is there in any row or any column then that particular row and column is blocked for any other queens
    
    //so first lets see for a 2*2 board .. where we can place queen in 2 rows
    //firstly we can place the queen in the i=0 row and then we go to the next row and place the queen in 1st place of i=1 row
    //and then we remove the queen from the i = 1 row and then we put the queen to the second place of the i = 1 row
    //and then we backtrack to the i=0 row and mobe the queen from the 1st place of that row and put in the second place .
    
    //solutions are >>

    // q   q       q   q
    // q     q   q     q

    //we are not seeing which queen are attacking which one we are just finding out how can we put queens in the places of a 2*2 board tht is how many solutions will be ther

    //now we have to check that is it safe to place the queen
    //what are the unsafe places  >>
    // the complete row , the complete column , the diagonals
    //that is we place the queen where it is safe
    //and we have to keep in mind one queen should be placed in each row .
    //if there is no queen left in any row then we know some misplacement happend on the previous row
    //so we backtrack to the prev row and place that on another safe place and then place the queen in the next row

    //another thing is when we place the queens , we check that there is no queens on the top column of that column
    //check left diagonal and check the right diagonal
    //if there are no queens on the top or the top left and top right diagonals then it is safe to place the queen 
    //and we dont check the bottom column and the bottom left and the bottom right diagonals as we are placing the queens from the top so no need to check the bottom


    public static void nQueens(char[][] board , int row){

        //base case>
        if(row == board.length){
            printBoard(board);
            return;
        }
        //kaam
        for(int j = 0 ; j<board.length ; j++ ){
            //we put the queen in every row , if it is safe then
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                //and then we call the nqueens recursively for the next row
                nQueens(board, row+1); //recursion
                //backtracking step>
                //now when we backtrack as discussed then we have to remove that previously placed queen and put it in some other place
                board[row][j] = '.'; //remove the queen from that place
                //and then the for loop ends and then it will run again for another place of the row and so on and differenet places will be generated to place the queen . note the attacking part of queen is not considered
            }
        }
    }

    public static boolean isSafe(char[][] board , int row , int col){ //we check isSafe for the board , the current row and the current column
        //we have to check for vertically up diagonally left up and the diagonally right up

        //vertically up>
        //this means the column is same the row is variable here by 1 until the row becomes 0 that is the first row
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonally left up>
        //we can see all the row decreases by one and the j decreases by one until both of them becomes 0
        for(int i = row-1, j = col-1 ; i >=0 && j >=0 ; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonally right up>
        //we can see the row decreases by 1 and the column increases by 1
        for(int i = row-1 ,  j = col+1 ; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("--------Chess Board----------");
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][]  board = new char[n][n];
        //make the board >>
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board,0);
    }
}
