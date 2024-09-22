package leetcode75;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int maxproduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = Integer.MIN_VALUE;

            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    if (nums[j] > currentProduct) {
                        currentProduct = nums[j];
                        if (currentProduct > maxproduct) {
                            maxproduct = currentProduct;
                        }
                    }
                } else {
                    currentProduct = currentProduct * nums[j];
                    if (currentProduct > maxproduct) {
                        maxproduct = currentProduct;
                    }
                }

            }
        }

        return maxproduct;

    }

    // both side iteration login solution todo

    public static void main(String[] args) {

        System.out.println("MAXIMUM PRoduct");
        int[] array = { -2 };
        // int maxsum = maxSubArray(array);
        int maxproAns = maxProduct(array);
        System.out.println(maxproAns);

    }

}