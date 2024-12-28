public class TransposedMatrix {
    public static int[][] transposedMatrix(int[][] matrix){
        int n = matrix.length;
        //int[][] res = new int[m][n] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < matrix[0].length ; j++){
                //transpose of the matrix
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix  = {{1,4,7},
                            {2,6,8},
                            {3,9,10}};
        printMatrix(transposedMatrix(matrix));
    }
}
