package practice;
import java.util.*;
public class binarySearchPrac {
    
    public static int BinarySearch(int[] arr , int key) {
        int n  = arr.length;
        int start  = 0 , end = n-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key < arr[mid]) {
                //smaller element search in the left side>
                end = mid-1;
            } else {
                //search in bigger side>
                start = mid+1;
            }
        }
        System.out.println("nno key found!!");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take the input array>
        System.out.println("enet the size of the array >>");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter all the elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the key to be found in the array");
        int key = sc.nextInt();
        System.out.println("the key is in the index : ---");
        int answer = BinarySearch(arr, key);
        System.out.println(answer);
    }
}
