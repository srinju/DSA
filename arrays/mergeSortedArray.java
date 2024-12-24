public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //we will take 3 pointers
        //one for nums1 , one for nums2 , one for the insert element in nums1
        //we will compare from the last of the array and put the elements at the last 
        int p1 = m - 1; //for the first arr idx
        int p2 = n - 1; //for the second array idx
        int p = m+n-1; //for the insert element       
        while(p1 >= 0 && p2 >=0 ){
            if(nums1[p1] > nums2[p2]){ //if the eleement of nums1 greater tan the elements of the firsr arr then 
            nums1[p] = nums1[p1]; //place the element at the end of the array of the nums1 array
            p1--; //decrement the nums1 element pointer
            } else {
                nums1[p] = nums2[p2];//place the larger element of nums2 in the nums1 array at the end
                p2--; //decrement the nums2 idx pointer
            }
            p-- ; //decrement the final array pointer too
        }
        //for the remaining elements in nums2
        //remaining elements of nums1 are already placed so no need to place again
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            //decrement both of the indexes
            p2--;
            p--;
        }
    }
}
