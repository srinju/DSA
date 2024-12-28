public class DiagonalSumOfMatrix {

    public static int DiagonalSum(int[][] matrix){

        /* UNOPTIMISED CODE

        //for primary diagonal i=j is the condition
        //for secondary doagonal we can see that the i is increasing and the j is decreasing and both of their sum is n-1 that is the row and col size  - 1
        
        int n = matrix.length;
        int m = matrix[0].length;
        int primarySum = 0;
        int secondarySum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i==j){ //primary diagonal
                    primarySum = primarySum + matrix[i][j];
                }
                if(i+j == n-1){ //secondary diagonal
                    secondarySum = secondarySum + matrix[i][j];
                }
            }
        }
        return primarySum + secondarySum; //return the sum of primary and secondary diagonals
        */

        //OPTIMISED CODE >>

        //for primary doagonal it is when both the cordinates are same , which we can say i=i too
        //for secondary diagonal of 3 *3 lets say an odd case  ,,,, here the secondary diagonal sum er somai middle element overlap korbe so we have to ignore that in secondary diagonal

        int n = matrix.length;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            //primary diagonal >>
            sum += matrix[i][i]; //whenevr we are iterating through the rows of the matrix we add the elements where i and j are i
            //secondary diagonal >>
            //if i+j = n-1 ,  then j = n-i-1
            if(i != n-i-1){ //this is we calculate secondary diagonal when i != j  , otherwise primary diagonal covers it already
                sum += matrix[i][n-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                        };
        System.out.println("the diagonal sum of matrix is  : " + DiagonalSum(matrix));
    }
}
