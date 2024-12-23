//second max value in an array 
//note there can be duplicate elements in an array

public class SecondMaxValue {
    //take a sseconfdmx and a max var
    //then traverse through the loop 
    //check if the elements are greater than max
    //if greater than max then make the max as that elements , but note before doing that make the secondmax value to max and then make the max value to the array element
    // check else statement ->  if that element of array is more thatn the second max and and that element is not equal to max then make the secondmax as that element

    public static int SecondMax(int[] arr){
        int n = arr.length;
        //make the max and the second max as min value as they are -2147483648
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max) { //checking if the element is larger than the max
                secondMax = max; //make the second max the prev max
                max = arr[i]; //update max
            } else if(arr[i] > secondMax && arr[i] != max){ // check if the element of the array is greater than the second max and and if the elemene of that array is not equal to the max element 
                secondMax = arr[i]; //asign the second max as that variable
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {13,34,2,34,33,1};
        System.out.println("the second max element of the array is : " + SecondMax(arr));
    }
}
