package practice;
import java.util.*;
public class mergeSortPrac {
    
    public static void merge(int[] arr , int si , int ei , int mid) {
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <=ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        //copy elemetns of k to the original array
        for(k = 0  , i = si; k < temp.length ; k ++ , i++){
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int[] arr , int si , int ei){
        if(si >= ei) {
            return;
        }
        if(arr.length == 0){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);

    }

    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i =0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter no of elemenets in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
