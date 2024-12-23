//reverse the array from start to end given the starting points and ending points

public class reverseArr {
    //array
    //take two indexes , start and end pointers
    //make a temp arr
    //while start is less then end 
    //take the start to temp arr
    //then assign the end index to the start index
    //now assign the temp value to the end index 
    //increment the start pointer and end pointer
    //done 

    public static int[] ReverseArray(int[] arr , int start , int end){
        int n = arr.length;
        start = 0;
        end = n - 1;
        while(start < end){
            int temp = arr[start]; //take the start index to the temp array
            arr[start] = arr[end]; //swap the start and end indexes
            arr[end] = temp; //assign the temp index to the end index 
            //increment and decremnet the start and end indexes
            start++;
            end--;
        }
        return arr;
    }
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,11,5,10,7,2};
        int n = arr.length;
        printArray(ReverseArray(arr,0, n-1));
    }
}
