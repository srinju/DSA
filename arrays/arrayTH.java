
public class arrayTH {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){ //print elements of an array >
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //this print stattement takes the cursor to the next line 
    }
    public static void main(String[] args) {
        int[] newArray = new int[5];
        //printArray(newArray); //we see that array without declaring the values gives the default values as 0 only
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[3] = 4;
        newArray[1] = 69;
        newArray[4] = 101;
        printArray(newArray); //updation of indexes of the array
        System.out.println("the length of the array is : " + newArray.length);
        System.out.println("the last element of the array is  : " + newArray[newArray.length-1]);
    }
}