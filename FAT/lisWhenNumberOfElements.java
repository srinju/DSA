package FAT;
import java.util.*;
public class lisWhenNumberOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elemetnes");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for(int i = 1 ; i < n ; i ++){
            for(int j = 0 ; j < i ; j ++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
            }
        }

        int maxLen = 0;
        for(int len : dp){
            if(len > maxLen){
                maxLen = len;
            }
        }

        System.out.println("lenght of the lcs : " + maxLen);
        sc.close();
    }
}
