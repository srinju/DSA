package practice;
import java.util.*;
public class quickSortPrac {
    
    public static int partition(int[] arr , int si , int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si  ; j < ei ; j++){
            if(arr[j] < pivot){
                //swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swap agagin to put the pivot in its suitable place>
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSort(int[] arr ,int si ,int ei){
        if(si >= ei){
            return;
        }

        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);

    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
