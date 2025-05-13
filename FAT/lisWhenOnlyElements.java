package FAT;

import java.util.Arrays;
import java.util.Scanner;

public class lisWhenOnlyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        String[] input = sc.nextLine().split(" ");
        int[] nums = Arrays.stream(input).mapToInt(Integer :: parseInt).toArray();

        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for(int i = 1 ; i < n ; i++) {
            for(int j = 0 ; j < i ; j ++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int lis = Arrays.stream(dp).max().getAsInt();
        System.out.println("length of lis : " + lis);
        sc.close();
    }
}
