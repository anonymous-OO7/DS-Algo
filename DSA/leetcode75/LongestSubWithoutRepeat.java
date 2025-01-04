package leetcode75;

public class LongestSubWithoutRepeat {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 0) {
            return 0;
        }
        int currMax = 1;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                int tempcount = 1;
                if (s.charAt(i) != s.charAt(j)) {
                    tempcount++;
                    if (tempcount + 1 > currMax) {
                        currMax = tempcount + 1;
                    }
                } else {
                    break;
                }
            }
        }
        return currMax;
    }

    public static void main(String[] args) {

    }

}
