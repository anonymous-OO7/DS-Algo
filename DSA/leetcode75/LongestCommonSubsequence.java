package leetcode75;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] matrix = new int[text2.length() + 1][text1.length() + 1];
        for (int i = 1; i <= text2.length(); i++) {
            for (int j = 1; j <= text1.length(); j++) {
                if (text1.charAt(j - 1) == text2.charAt(i - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
            }
        }
        return matrix[text2.length()][text1.length()];

    }

    public static void main(String[] args) {

    }

}
