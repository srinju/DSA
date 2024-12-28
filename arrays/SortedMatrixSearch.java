public class SortedMatrixSearch {
    
    //matrix is sorted row wise and column wise
    //if we see closely then we get that the top right placr and the bottom left place are the best placrs to begin search
    //and we also see if we start searching from the top right then 
    //if the key < cell val then we move left and
    //if the key > cell val then we move bottom
    //by doing this we arrive at the key more efficiently .

    public static boolean SearchKey(int[][] matrix , int key){
        int row = 0;
        int column = matrix[0].length - 1;
        
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == key){
                System.out.println("key found at : " + "(" + row + "," + column + ")");
                return true;
            }
            else if(key < matrix[row][column]){
                column--; //move down
            }
            else {
                row++; //move left
            }
        }
        System.out.println("key not found !!");
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}
                        };
        int key = 33;
        SearchKey(matrix, key);
    }
}
