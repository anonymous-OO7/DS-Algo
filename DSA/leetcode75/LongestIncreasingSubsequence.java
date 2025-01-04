package leetcode75;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int k = 0; k < dp.length; k++) {
            if (dp[k] > max) {
                max = dp[k];
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }

}
