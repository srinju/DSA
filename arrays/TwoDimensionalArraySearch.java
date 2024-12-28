import java.util.*;
public class TwoDimensionalArraySearch {

    public static boolean Search(int[][] matrix , int key){
        int n = matrix.length; //take the rows length
        int m = matrix[0].length; //take the cols length
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<m ; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at location : " + i +"," + j);
                    return true;
                }
            }
        }
        System.out.println("key not found!!");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int n = matrix.length; //take the rows length
        int m = matrix[0].length; //take the cols length
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix in 3 * 3 size : ");
        for(int i = 0 ; i < n  ; i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt(); //take the input;
            }
        }
        sc.close();
        Search(matrix, 5); //searching for the 5 element in the matrix
    }
}
