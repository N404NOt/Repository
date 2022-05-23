package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-23
 * Time: 15:19
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        dp[0][1]=-prices[0];
        dp[0][0]=0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
        }
        return dp[prices.length-1][0];
    }
}
