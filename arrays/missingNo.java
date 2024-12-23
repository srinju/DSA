
//find the missing no in an array > 

//given array from 1 to 8 is  > 
//{2,4,1,8,6,3,7}
//we can see that element 5 is missing 

public class missingNo {
    //we know the sum of first n natural numbers is n*(n+1)/2
    //from the arr given we do arr.length = n and find the sum
    //then traverse through the array and subtract all the elements in the array from the sum that we calculated
    //this will result into the remaing number , which is the missing number in the array

    public static int MissingNumber(int[] arr){
        int n = arr.length + 1;
        int sum = n*(n+1)/2; //find the sum with this formula
        for(int num : arr){ //traverse throught the loop and subtract the elements from the sum , this type of denotion is for traversing each nd every elements of the array
            sum = sum  - num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,7};
        System.out.println("the missing element in the array is : " + MissingNumber(arr));
    }
}
