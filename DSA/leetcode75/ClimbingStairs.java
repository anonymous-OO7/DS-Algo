package leetcode75;

public class ClimbingStairs {

    public static int countStairs(int n) {
        int[] array = new int[n + 1];
        int answer = climbStairs(n, array);

        return answer;

    }

    public static int climbStairs(int n, int[] arr) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }

        int onebelow = climbStairs(n - 1, arr);
        int twobelow = climbStairs(n - 2, arr);
        int ans = onebelow + twobelow;
        arr[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("climbing stairs");
        int n = 45;
        int numberofways = countStairs(n);
        System.out.println(numberofways);
    }
}
