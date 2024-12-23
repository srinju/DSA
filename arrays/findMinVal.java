//find the min value of an array 

public class findMinVal {
    //take the first elemenet as the min element
    //traverse through the array and see if there is any element that is less than the min
    //if there is any element less than the min then we update the min

    public static int minValue(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("invalid input , array cant be empty");
        }
        int n = arr.length;
        int min = arr[0]; //assign the first element of the array as min
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < min){ //check if there is any element less than the min
                min = arr[i]; //re assign the min to that element
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5,9,3,15,1,2};
        System.out.println("the min value of the array is : " + minValue(arr));
    }
}
