public class BinarySearch{
    //for binary search we need a sorted array
    //we will check the mid ,  if mid is smaller than key then search array's second half else short half
    //then again check the same thing 
    //erom korte korte final key peey jabo

    //APPROACH>>

    //first we will find out the mid of the array
    //and then we will check if the key is smaller than the key
    //if true then we will check the first half that is 0 to n/2 - 1
    //else the secind half that is from n2+1 to n-1
    //we will repeat the process until we get the key
    //base case is if the mid element is the key then we return the mid element that is the key
    //and array size will be decreasing as n/2 .. n/4 ... n/8 and so on until single element array is there

    public static int binarySearch(int[] arr , int key){
        int n = arr.length;
        int start = 0 ; int end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){ //base case
                return mid;
            }
            if(key < arr[mid]){ //then search left side of the array
                end = mid - 1; //end will change from n-1 to this
            } else { //search right side of the array
                start = mid + 1; //start will change from 0 to this 
            }
        }
        System.out.println("key not found");
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 4;
       System.out.println("index for key is : " +  binarySearch(arr, key));
    }

}