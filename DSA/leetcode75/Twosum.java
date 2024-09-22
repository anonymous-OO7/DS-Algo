package leetcode75;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Two Sum");
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;
        int[] returnedArray = twoSum(numbers, target);

        System.out.println("Indices: " + returnedArray[0] + ", " + returnedArray[1]);
    }
}
