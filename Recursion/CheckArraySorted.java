package Recursion;

public class CheckArraySorted {
    
    //here we have to check that an array is sorted or not 
    //using recursion
    //approach >
    //check for the first tow elements
    //and then do recursion for the rest part of the array including the second element

    //base case if when i is equals to arr.length-1

    public static boolean isSorted(int[] arr , int i){ //we will take an array and a starting point as an input
        //base case >
        int n = arr.length;
        if(i == n-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1); //do the recursive call for the rest of the array starting from the second index itslef
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0 ; //starting point is the first index only
        if(isSorted(arr,i)){
            System.out.println("arr is sorted!");
        } else {
            System.out.println("arr is not sorted!");
        }
    }
}
