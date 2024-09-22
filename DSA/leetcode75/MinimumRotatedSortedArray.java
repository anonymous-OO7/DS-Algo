package leetcode75;

public class MinimumRotatedSortedArray {

    public static int findMin(int[] nums) {

        int min = Integer.MAX_VALUE;

        if (nums[0] >= nums[nums.length - 1]) {
            for (int i = nums.length - 1; i >= 0; i--) {

                if (nums[i] <= min) {
                    min = nums[i];
                } else {
                    return min;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] <= min) {
                    min = nums[i];
                } else {
                    return min;
                }
            }
        }

        return min;
    }

    // both side iteration login solution todo

    public static void main(String[] args) {

        System.out.println("Minimum rotated sorted array");

        int[] array = { 3, 4, 5, 1, 2 };
        int minArray = findMin(array);

        System.out.println(minArray);

    }
}
