public class TransposedMatrix {
    public static int[][] transposedMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[m][n]; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                res[i][j] = matrix[j][i];
            }
        }
        return res;
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
