package BasicSorting;

public class DivideNConquer {
    public static void mergeSort(int[] arr , int si , int ei){

        //we use divide and conquer approach
        //we find the mid of the array , so there will be two part of the array , left part and the right part
        //we keep dividing the left and right parts of the arrays until the most smallest form appears in both of the parts
        //matlab single element thakle r divide korte hobena
        //sob single single element beche galo left r right parts er 
        //now recursively sort the left and right parts of the array
        //and the last step is to mege the both sorted parts
        //we take two iteratiors for the left part and the right part
        //and then we compare both of the indexes and put on the temp array combined which gives the sorted merged array as the answer

        //base case >
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2 ; //(si+ei)/2
        mergeSort(arr, si, mid); //left wala part
        mergeSort(arr, mid+1, ei); //right wala part
        //now we merge the both left and right sorted parts

    }
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }   
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
    }
}
