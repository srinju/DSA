
public class SearchInRotatedSortedArray {
    
    //PROBLEM STATEMENT >

    //input : sorted , rotated array with distrinct numbers (in ascending order) it is rotated at a pivot point . Find the index of given element.
    //{4,5,6,7,0,1,2} --> we can see this is a sorted array rotated around the pivot 2
    //we can do all kind of searches here but note we have to find it in O(nlogn) time complexity

    //APPROACH >

    //we will apply a modified binary search approach
    //so we can analyse the array and visualise the array in form of a graph

    /*

       |
       |                L1
       |                  *
       |               *                    
       |            *
       |         *
       |- - - - - - - - - *  L2
       |               *
       |_____________*_____________

     */

    //now we can find the mid of the given array
    //either the mid will be on L1 or L2 , in this example for the given array it is line 1
    //on L1 so if  si <= target <= mid then the key will be on the left else on the right
    //on L2 so if mid =< targer <= ei then it will be on the right part else on the left part , we can clearly see it from the graph

    //basically what we are saying is that if the mid is on L1 ,
    //then there will be two cases either left or right(entire right part of the mid , in which the L1 also lies as it is right part of the mid)
    //and on the other case that is if mid <= target <= ei then the target is in the right side of L2 in which there is only right part of L2 no L1 involved , else the left part of L2 in which the L1 also is there 

    //we clearly depict from the graph that mid will be on L1 if the arr[si]<= mid
    //and the mid will be on L2 if the mid <= arr[ei]


    public static int RotatedSortedArraySearch(int[] arr , int target , int si , int ei){

        //base case >
        if(si > ei){ //means si > ei that is all array searched and cant find array
            System.out.println("target element not present in the array");
            return -1;
        }

        int mid = si+(ei-si)/2; //mid

        if(arr[mid] == target){ //if target is the mid only
            return mid;
        }

        //mid on L1 >
        if(arr[si] <= arr[mid]){
            if(arr[si] <= target && target <= mid){ //search left part of the L1
                return RotatedSortedArraySearch(arr, target, si, mid-1);
            } else { //search on right
                return RotatedSortedArraySearch(arr, target, mid+1, ei);
            }
        } else { //mid on L2
            if(arr[mid] <= target && target <= arr[ei]){ //search right side of the L2
                return RotatedSortedArraySearch(arr, target, mid+1, ei);
            } else { //search left
                return RotatedSortedArraySearch(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int TargetIndex = RotatedSortedArraySearch(arr , target , 0 , arr.length-1);
        System.out.println(TargetIndex);
    }
}
