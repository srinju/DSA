package BasicSorting;

public class AllSorting {

    public static int[] bubble(int[] arr){

        // bubble sort logic is that we want to see the larger elemenet at the end  , if we see that the next element is smaller than the present element then we swap the element
        //by doing that we end up in a sorted array

        int n = arr.length;
        for(int pass = 0 ; pass < n ; pass++){ //do that for number of times
            for(int i = 0 ; i+1 < n ; i++){ //thsi one does sorting once
                //if the next value is greater than the present value then perform swapping , so swapping korte korte bora mal pechone chole jabe
                if(arr[i+1] < arr[i]){ //this is for increasing order  , if we want decreasing order then we just change the < to >
                    //swapping >
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] Selection(int[] arr){

        //here the logic is that we take the smallest element and put it at the front
        //{5,4,3,2,1}
        //smallest is 1 so { 1 , 5  ,4 , 3 , 2}
        //then {1 , 2 , 5 ,4, 3}
        //we can see that the i is sorted part
        //and we dont want to do the nth sortng coz it will be already sorted so out loop runs till n-1
        //and we run two loop one for i = 0 to n-1 and one for j = i+1 to n-1
        //and assign the smallest value to i
        //when we see that any element in that array that is smaller than ith element then we make the smallest as that j

        int n  = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int smallest = i;
            for(int j = i+1 ; j < n-1 ; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
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
        printArr(bubble(arr)); //bubble sort
        printArr(Selection(arr)); //selection sort
    }
}

