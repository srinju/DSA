public class mountainArray {
    public static boolean validMountainArray(int[] arr) {
        //base case arr.length>=3
        //climp up such tht arr[i] < arr[i+1]
        //climb down such that arr[i] > arr[i+1]
        //also make sure that the peak is not at the starting or at the end then it is not a valid mountain

        int n  = arr.length;
        int i = 0;
        if(n < 3){ //base case
            return false;
        }
        //climbing up the mountain
        while(i+1 < n && arr[i] < arr[i+1]){
            i++;
        }
        //check if the peak is at the first or at the last then return false
        if(i == 0 || i == n-1){
            return false;
        }
        //stepping down the mountain
        while(i+1<n && arr[i] > arr[i+1]){
            i++;
        }
        //after successfully checking mountain array , check whether the idx is at the last or not>
        return i == n-1;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,3,5,4,2,1,0};
        if(validMountainArray(arr)){
            System.out.println("it is  mountain array");
        } else {
            System.out.println("not a mountain array");
        }
    }
}
