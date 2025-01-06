package Backtracking;

public class SudokuSolver {
    
    //in soduku there is 9*9 grid and there is mini 9 grids of 3*3 each .
    //and the rule is in a same position there cannot be the same number in that row and coulmn and also the same number could not exist in the grid
    //and we are placing digits from 1 to 9

    //APPORACH >>

    //for the numbers 1 to 9
    //first we will check if the place is safe vertically and horizontally
    //if is safe then we will return true
    //if yes then we will place that number
    //and move the the next cell ... cell complete horizontally 
    //then we come down vetical by one and do the same thing 
    //then we will check whether that element is there on the grid or not
    //if the number is in the grid then we backtrack to that place and remove the number and put another number
    

    public static boolean sudokuSOlever(int[][] sudoku , int row , int col){
        //base case>
        if(row == 9 ){
            return true;
        }
        
        int nextRow = row , nextCol = col+1;
        if(nextCol == 9){ //this means when we complete a row then we move to the next row and the next col becomes 0
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){ //if the place is already filled thenw e jump over to the next cell after that and solve again
            return sudokuSOlever(sudoku, nextRow, nextCol);
        }
        for(int digit = 1 ; digit <= 9 ; digit++ ){
            if(isSafe(sudoku , row , col , digit)){
                sudoku[row][col] = digit; //place the digit
                //after placing the digit also there is no gurantee that the soln can exist or not so we check the next place that is it ok if not then we backtrack and put 0 and solve again
                if(sudokuSOlever(sudoku, nextRow, nextCol)){ //recursively do it for the next row/col depending upon the position .. position decision done above and if it is true then on the next cell a number is there
                    return true;
                }
                sudoku[row][col] = 0; //if false that means there is no element to be placed                 
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] sudoku , int row, int col , int digit){
        //col check>
        for(int i = 0 ; i <= 8 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //row check>
        for(int j = 0 ; j<=8 ; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        //check grid>

        //for checking grid we see>
        //that for the first 3rd of the grid if we divide by 3 for any row number it will be  = 0
        //for second wala third it will come 1
        //for third wala part it will come 0
        //therefore if we do row/3 then if 0 then first wala hissa if 1 then second wala hissa and if 2 then third wala hissa
        //same shit goes for the column dissection too

        //now for the starting row and starting column of each 3*3 grid
        // do sr = (row/3)*3 and sc = (col/3)*3

        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int[][] sudoku){
        for(int i =0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("initial soln");
        printSudoku(sudoku);

        if(sudokuSOlever(sudoku, 0, 0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution doesent exist");
        }
    }

}
