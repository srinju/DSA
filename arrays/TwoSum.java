public class TwoSum { //leetcode question two sum
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length; //size of the array
        //make a result array of size 2
        //take two indexes one starting from zero and one starting from 1
        //if the sum of two elements equal to the target then return the indexes or index
        int[] resultArr = new int[2];
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(target == (nums[i] + nums[j])){
                    resultArr[0] = i;
                    resultArr[1] = j;
                }
            }
        }
        return resultArr;
    } 
    public static void printArr(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        printArr(twoSum(nums, target));
    }
}
