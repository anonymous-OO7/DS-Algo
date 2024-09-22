package leetcode75;

public class CountingBits {

    public static int intToBinary(int n) {

        String s = "";
        int count = 0;

        while (n > 0) {

            s = ((n % 2) == 0) ? "0" : "1" + s;
            count = count + (n % 2);
        }

        // return s;
        return count;

    }

    public static int[] countBits(int n) {
        int[] ansarr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ansarr[i] = Integer.bitCount(i);
        }
        return ansarr;
    }

    // function to solve in o(n)
    public static int[] countBitsfast(int n) {
        int[] ansarr = new int[n + 1];
        if (n == 0) {
            return ansarr;
        }
        ansarr[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                ansarr[i] = ansarr[i / 2] + 1;
            } else {
                ansarr[i] = ansarr[i / 2];
            }
        }
        return ansarr;
    }

    public static void main(String[] args) {

        System.out.println("Counting bits");

        int n = 5;

        int ans[] = countBits(n);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        // int ans = intToBinary(5);

        // System.out.println(ans);

    }
}

// built in function builtin in c++ popcount function rerturns number os set
// bits. n*log(n)
// ansarr[i] = Integer.bitCount(i);

// make in log(n)