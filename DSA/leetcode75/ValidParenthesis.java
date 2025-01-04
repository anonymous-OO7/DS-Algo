package leetcode75;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (i == 0 && (c == '}' || c == ']' || c == ')')) {
                return false;
            }

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                Character poppedChar = stack.pop();
                if (c == '}') {
                    if (poppedChar != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (poppedChar != '[') {
                        return false;
                    }
                } else if (c == ')') {
                    if (poppedChar != '(') {
                        return false;
                    }
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {

        System.out.println("Valid parenthesis");

        String str = "]";

        boolean answer = isValid(str);

        System.out.println("Is valid ->" + answer);

    }
}
