public class thirdMax {
    public int thirdMax(int[] nums) {
        //taking input as long if the third max exists less then the min int value
        Long max = Long.MIN_VALUE;
        Long secondMax = Long.MIN_VALUE;
        Long thirdMax = Long.MIN_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > max){
                thirdMax = secondMax;
                secondMax = max; //assign prv value of max to second max 
                max = (long) nums[i] ; //make the new max element as the max
            } else if(nums[i] > secondMax && nums[i] != max){
                thirdMax = secondMax; //assign the previous secondMax val to 3rdMax
                secondMax = (long) nums[i]; //assign the new secondMax val to secondMax
            } else if(nums[i] > thirdMax && nums[i] != secondMax && nums[i] != max){
                thirdMax = (long) nums[i];
            }
        }
        return thirdMax == Long.MIN_VALUE ?  max.intValue() :  thirdMax.intValue();
    }
}
