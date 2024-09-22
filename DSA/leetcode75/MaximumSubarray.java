package leetcode75;

import java.util.Arrays;

public class MaximumSubarray {
    public static int arraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int maxSubArray(int[] nums) {
        int maxsum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int[] tempSubarray = Arrays.copyOfRange(nums, i, j);
                int tempsum = arraySum(tempSubarray);
                if (tempsum > maxsum) {
                    maxsum = tempsum;
                }
            }
        }
        return maxsum;
    }

    // kadans algorithm
    public static int kadansAlgorithm(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentsum = currentsum + nums[i];
            if (maxsum <= currentsum) {
                maxsum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum subarray");
        int[] array = { 5, 4, -1, 7, 8 };
        // int maxsum = maxSubArray(array);
        int answerKadans = kadansAlgorithm(array);
        System.out.println(answerKadans);

    }
}
