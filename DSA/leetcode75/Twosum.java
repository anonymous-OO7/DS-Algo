package leetcode75;

public class Twosum {

    // loop n
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

    // better approach is to use hashmap .. store each element if target - element
    // is not exhistinh in map, else return answer. O(n* log n)

    // optimal approach -- sort the main array, then place two pointers at start and
    // end. then sum them up, if sum is less then movestarting one, else last one

    // time complexituy - O(n) + nlogn; space o(1)

    public static void main(String[] args) {
        System.out.println("Two Sum");
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;
        int[] returnedArray = twoSum(numbers, target);

        System.out.println("Indices: " + returnedArray[0] + ", " + returnedArray[1]);
    }
}
