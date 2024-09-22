package recursion;

import java.util.Scanner;

public class subsets {

    public static void printSubstring(String s) {
        // System.out.println(s + " string element");

        if (s.length() == 1) {
            System.out.println(s);
        } else {
            System.out.println(s + " string element");

            s = s.substring(1);
            printSubstring(s);

        }

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            printSubstring(str);
        }

    }

}
