// Java program to take an integer
// as input and print it

import java.util.Scanner;
import java.util.*;

class codechefTest {

    public static int lengthOfLongestSubstring(String s) {

        int l = s.length();
        int maxLength = 0;
        int currentMax = 0;
        int startindex = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        if (l == 1) {
            return 1;
        }

        for (int i = 0; i < l; i++) {

            char ch = s.charAt(i);
            System.out.println(ch + "CURRENT CHARCTER outside");

            if (map.get(ch) == null) {

                System.out.println(ch + "CURRENT CHARCTER");

                currentMax = currentMax + 1;
                System.out.println("Incrementing current" + currentMax);

                map.put(ch, 1);
                if (currentMax >= maxLength) {
                    System.out.println("Incrementing MAXLENGTH" + maxLength);

                    maxLength = currentMax;
                }

            } else {

                System.out.println("clearing mapp");
                map.clear();
                currentMax = 0;
                i = startindex;
                startindex = startindex + 1;

            }

        }

        return maxLength;

    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        int len = strs.length;
        String firstStr = strs[0];
        String lastStr = strs[len - 1];
        String answer = "";

        for (int i = 0; i < firstStr.length(); i++) {

            if (firstStr.charAt(i) == lastStr.charAt(i)) {

                answer = answer + firstStr.charAt(i);

            } else {

                return answer;
            }

        }

        return answer;
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Iterator<Character> it = map.keySet().iterator(); // keyset is a method

        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {

                int n = map.get(s.charAt(i));
                map.put(s.charAt(i), n + 1);
            }
        }

        if (map.size() == 1) {
            return s.length();
        }

        int countEvens = 0;
        int countSingle = 0;
        int countOdds = 0;
        int oddOccured = 0;
        for (Character i : map.keySet()) {
            System.out.println(i + " " + map.get(i));

            if (map.get(i) % 2 == 0) {

                countEvens = countEvens + map.get(i);
            } else {
                oddOccured = 1;
                countOdds = countOdds + map.get(i) - 1;

            }

            // if(countSingle == 0){

            // if(map.get(i) == 1){
            // countSingle ++;
            // }
            // }

        }

        if (oddOccured == 0) {
            return countEvens;
        } else {
            return countEvens + countOdds + 1;
        }
        // return countEvens + countOdds + 1;

    }

    public static int maxIcecreams() {

        return 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] cars = { "dog", "racecar", "car" };
        String s = "abccccdd";
        int ans = longestPalindrome(s);

        System.out.print(ans + " ANSWER");

    }
}
