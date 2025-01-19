package stack;

import java.util.Stack;

public class greaterElementInCircularArray {
    public int[] nextGreaterElements(int[] nums) {
        
        //we make a the array size double and we will push the stack on the secondHalf(firts from the last)
        //and we will update the ans array only on the first half
        //and if we see carefully the firstHalf index is i = i % n; where n is the size

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        //the last index of the doubled array will be 2*n-1 as the size is 2*n
        //and we will travel reverse as the normal greater element pattern
        for(int i = 2*n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){ //i%n as the first half indexes are i % n if we see carefully
                stack.pop();
            }
            //while er baire -> stack.peek er value is greater than nums[i] that means we have the greater element
            //and we will perform the operationn in the ans array in the first half of the doubled array
            if(i < n){
                if(stack.isEmpty()){
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]);
        }

        return ans;
    }
}
