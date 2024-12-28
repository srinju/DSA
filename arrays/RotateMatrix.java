import java.util.Arrays;

public class RotateMatrix {
    //we have to rotoate the matrix 90 degrees clockwise>
    //we can clearly see that the 90 degrees rotated is the transpose of the matrix and ulta of each row
    //so we transpose the matrix
    //and then we reverse each row of the matrix

    public static int[][] rotateClock(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0  ; i < n ; i++){
            for(int j = i+1 ; j < m ; j++){
                //transpose of the matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row of the matrix >>
        for(int i = 0 ; i < n; i++){
            int start = 0;
            int end = n-1;
            while(start < end){
                //swap the start and end and start++ and end--
                //keeping in mind the row is constant that is i and the column element is only changing
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}
                        };
        rotateClock(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
