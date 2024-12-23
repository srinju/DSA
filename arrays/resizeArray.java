//resize the arraw that is kind of increase the capactity of the array

public class resizeArray {
    
    //take arr and capacity as input
    //make a temp array with the size of the capacity
    //traverse through the arr and put all the elements of indexes from the arr to the temp arr
    //once done then return the temp arr
    //so basically the function increases the capacity of the array by excahnging it with temp and coputing the elements into temp

    public static int[] resize(int[] arr , int capacity){
        int n = arr.length; //length of the input array
        int[] temp = new int[capacity]; //make the temp array with the size as the capacity
        for(int i  = 0 ; i < n ; i++){ //traverse through the array
            temp[i] = arr[i]; //exchange the elements of the arr to the temp arr
        }
        return temp; //return the temp array
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int capacity = n*2;
        int[] resizedArray = resize(arr, capacity);
        System.out.println("the length of the given input array is : " + arr.length);
        System.out.println("the length of the resized array is : " + resizedArray.length);
    }
}
