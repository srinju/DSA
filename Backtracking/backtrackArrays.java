package Backtracking;

//backtracking is used either for > 
//1> decision making
//2> optimisation
//3> enumaration


public class backtrackArrays {
    
    //what we have to do is that in recursion , when we climb up the call stack we print in index 0 we print 1 .... and so on
    //while climbind down from the call stack the values of the indexes in the array should be decreased by 2 , that is climb till base case hit and then climb down again
    //so  array while climbing up > [1,2,3,4,5]
    //while climbind down , hence the final array is  : [-1,0,1,2,3]

    public static void changeArr(int[] arr , int i , int val){ //this case will give two answers that is while climbind up the i will become = arr.length that is it will hit the base case and threfore and hence the base case will print the arr 
        //base case --> kaam(recursion)
        //base case>
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //kaam
        arr[i] = val;
        changeArr(arr, i+1, val+1); //climbed up
        //now climb down that is backtrack>
        arr[i] = arr[i] - 2; //decrease 2 in each index while climbind down
    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1); //this means that we start from the index 0 and the value to be replaced is 1
        printArr(arr);
    }
}
