package BasicSorting;

public class DivideNConquer {
    public static void mergeSort(int[] arr , int si , int ei){ //O(nlog(n)) .  it follows DEPTH FIRST APPROACH

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
        //we divide and make the left and right part into single elements recursively by putting the mid into borken arrays
        mergeSort(arr, si, mid); //left wala part
        mergeSort(arr, mid+1, ei); //right wala part
        //now we merge the both left and right sorted parts
        merge(arr, si, ei, mid);
    }

    public static void merge(int[] arr , int si , int ei , int mid){

        //we make a temp array that is the final combined array of both the pars
        //if left(0 --> 3) = 4 and right(4-->6) = 3 ==> then required size is 4+3 = 7 that is ei-si+1
        //make 3 iterators one for left one for right and one for the final temp array too
        //then run the a while loop such that the i(idx for the left part) is less than mid and the j(idx for the right part) is less than equal to ei
        //and then we check that if the element is smaller or not
        //the smaller one gets appended in the temp array
        //and we increment the k idx that is the idx for the temp array and we incremenet the idx of the part that was smalller

        int[] temp = new int[ei-si+1];
        int i = si; //idx for the left part of the array
        int j = mid+1; //idx for the right part of the array
        int k = 0; //idx for the temp array

        //merge the left and right part of the array >
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];//append the smaller element
                i++; //incremnet the pointer of the smaller element choosen and we are doing that as the larger element idx should stay at its place so that it cna be compared with the next index of the left side of the arrray
            } else {
                temp[k] = arr[j]; //append the smaller element
                j++; //incremenet the smaller eleemt idx 
            }
            k++; //increment the temp idx
        }
        //so here if the first part completes and the second part is left or vice versa then we have to make sure the elements are put in the temp array
        //for left part >
        while(i <= mid){
            temp[k] = arr[i];
            k++;
            i++;
        }
        //right part >
        while(j <= ei){
            temp[k] = arr[j];
            k++;
            j++;
        }
        //now we copy the temp array to the original array
        for(k=0 , i = si ; k < temp.length; k++ , i++){
            arr[i] = temp[k]; //copy the elements of the temp array to the original array
        }
    }

    public static void quickSort(int[] arr , int si , int ei){ //O(nlog(n)) . it has the same time complexity as merge sort but it takes less space than merge sort

        //worst case O(n^2) -- > worst case will come when array is either sorted in ascending or descending order
        //space complexity is O(1)
        
        // STEP 1 > we have to choose a pivot(the element where upon which when fixed the array can rotate)
        //          we  take the last element as pivot as a general approach
        // STEP 2 > then we try to put the elements that are smaller than the pivot to the left and the elements that are greater than the pivot to the right 
        //          so the ei is the last element and we take index i as -1 which will make space for the elements
        //          so we compare all the elements in the array with the pivot ,if the element is larger then it stays in its place else we swap the elements with the larger one
        //          for eg : {6,3,9,8,2,5} ==>  i = -1 and we check 6 > 5 so 6 stays in its place and then we check for 3 , and 3 < 5 so we swap the position of 6 and 3 
        //          but then also we can see that pivot will be at last , then again we have to do this swapping shit then pivot will be there at the suitable position           
        // STEP 3 >  we recursively call quicksort on the left part of the pivot and  quicksort on the right part of the pivot
        // BASE CASE >  when single element then return

        //pivot --> last element

        //base case >
        if(si >= ei){
            return;
        }

        //now what will the partition function will do is it will do the step 2 and give the pivot index at laast so that we can call recursion on left and right part of the pivot to make it sorted

        int p_idx = partition(arr, si, ei);
        quickSort(arr, si, p_idx-1); //left part of the pivot
        quickSort(arr, p_idx+1, ei); //right part of the pivot
    }

    public static int partition(int[] arr , int si , int ei){

        //we perform the step 2 here basically

        int pivot = arr[ei]; //pivot is the last element
        int i = si-1 ; //to make place for elements that are smaller than the pivot
        for(int j = si ; j < ei  ; j++){ //traverse through the array
            if(arr[j] < pivot){ //if the current element is less than j then we make the swap with the current element
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //remember we make the swap again to put the pivot to its suitable place >
        i++;
        int temp = pivot; //put the pivot in a temp
        arr[ei] = arr[i]; //pvot is nothing but arr[ei] and we put arr[ei] as the the arr[i]
        arr[i] = temp; //and then we put the pvot at the current position of the index
        return i;
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
        //mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
