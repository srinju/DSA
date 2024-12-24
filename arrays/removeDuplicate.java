public class removeDuplicate {
    public int removeDuplicates(int[] nums) {
        //iterate through the loop 
        //make a pointer called unique index and init to 0
        //if the element of the array != unique idx then increment the unique idx
        //and place the unique idx to the array element
        int n = nums.length;
        int uniqueindex = 0;
        for(int i = 1 ; i < n ; i++){ //iterate thru the loop
            if(nums[i] != nums[uniqueindex]){ //if the element of the array is not equal to the unique index pointer
                uniqueindex++; //then increment the unique index
                nums[uniqueindex] = nums[i]; //and replace the element of the array with the unique index
            }
        }
        return uniqueindex + 1;
         
    }
}
