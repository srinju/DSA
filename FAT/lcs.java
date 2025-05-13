package FAT;
import java.util.*;
public class lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String a = sc.nextLine();
        System.out.println("enter second string");
        String b = sc.nextLine();

        int m = a.length() ; int n = b.length();

        int[][] dp = new int[m+1][n+1];

        for(int i = 1 ; i <= m ; i ++){
            for (int j = 1 ; j <= n ; j ++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }             
            }
        }
        System.out.println("lengtrh of the lcs : " + dp[m][n]);
        sc.close();
    }
}
