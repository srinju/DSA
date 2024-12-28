package BasicSorting;

public class BubbbleSort {
    public static int[] bubble(int[] arr){
        int n = arr.length;
        for(int pass = 0 ; pass < n ; pass++){ //do that for number of times
            for(int i = 0 ; i+1 < n ; i++){ //thsi one does sorting once
                //if the next value is greater than the present value then perform swapping , so swapping korte korte bora mal pechone chole jabe
                if(arr[i+1] < arr[i]){
                    //swapping >
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {100,256 , 35 , 71 , 32 , 18 , 999 , 10 , 10  , 20};
        printArr(bubble(arr));
    }
}

