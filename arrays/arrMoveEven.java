//remove the even integers from an array

public class arrMoveEven {
     //get a count of the odd elements 
     //make a result array with that number of odd elements
     //now iterate through the input array again and update the elements of those new array with the old array to the index where the elements are odd

     public static int[] removeEven(int[] arr){
        int n = arr.length;
        int oddCount = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] resultArr = new int[oddCount];//make the new array with the oddcount array
        int idx = 0; //declare an idx for the new result array
        for(int i = 0 ; i < n ; i++){
            if(arr[i] % 2 != 0){
                resultArr[idx] = arr[i];
                idx++; //increment the idx so that all the idxes gets covered
            }
        }
        return resultArr;
     }
     public static void printArray(int[] arr){ //function to print the arrays
        int n = arr.length;
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        printArray(removeEven(arr));
     }
}
