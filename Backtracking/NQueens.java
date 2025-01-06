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
    
}
