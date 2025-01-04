package leetcode75;

import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin > i) {
                    break;
                }
                int diff = i - coin;
                if (dp[diff] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[diff] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {

        System.out.println("Coin change");
        int[] array = { 2 };
        // int maxsum = maxSubArray(array);
        int maxproAns = coinChange(array, 3);
        System.out.println(maxproAns);

    }

}
