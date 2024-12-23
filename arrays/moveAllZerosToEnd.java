//move all zeroes to the end of an array , without fucking the order of non zero elements

public class moveAllZerosToEnd {
    //array
    //take two indexes
    //j index focuses on the 0 mostly
    //traverse through the loop
    //check if the element of i idx is != 0 and idx of j is = 0 if that is true then perform swapping
    //else if the j element idx is not eq to 0 then increment j idx

    public static int[] moveZeroes(int[] arr){
        int n = arr.length;
        int j = 0; //decalre another index j
        for(int i = 0 ; i < n ; i++){ //traverse through the loop
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i]; //perform swapping
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++; //increment j value if the j idx is not equals to 0
            }
        }
        return arr;
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i< n ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,1,0,2,1,0,3};
        printArray(moveZeroes(arr));
    }
}
