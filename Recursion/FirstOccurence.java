package Recursion;

public class FirstOccurence {
    //we have to find the first occurence of an element in an array
    public static int firstoccur(int[] arr , int key , int i){
        //base case >
        if(key == arr[0]){
            return 0;
        }
        if(arr[i] == key){
            return i;
        } else {
            return firstoccur(arr, key, i+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6};
        int key =5;
        int i= 0; //starting point in the array
        System.out.println("the element " + key + "first occured at : " + firstoccur(arr,key,i));
    }
}
