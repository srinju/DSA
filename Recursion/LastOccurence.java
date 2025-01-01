package Recursion;

public class LastOccurence {
    //we have to find the last occurence of an element in an array using recursion
    public static int lastOccur(int[] arr ,int key , int i){
        if(i==0){ //base case is the whole array searching is complete
            System.out.println("element not found in the array ");
            return -1;
        }
        //we can traverse the array from the end to the front and find the first occurence of the element from the end that will be the last occurence in the normal scenario
        if(arr[i] == key){
            return i;
        }
        return lastOccur(arr, key , i-1); //we compare the recursive part for the rest of the array which includes the second last element as we are travelling in reverse
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int n = arr.length;
        int i = n-1; //we sstart from the last index
        int key = 3;
        System.out.println("the last occurence of " + key + "is : " + lastOccur(arr, key , i));
    }
}
