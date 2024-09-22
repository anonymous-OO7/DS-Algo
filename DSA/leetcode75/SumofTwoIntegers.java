package leetcode75;

public class SumofTwoIntegers {

    public static void convertToBinary(int num) {

        String binarynum = Integer.toBinaryString(num);

        System.out.println(binarynum);

    }

    public static int getSum(int a, int b) {

        // String binaryone = Integer.toBinaryString(a);
        // String binarytwo = Integer.toBinaryString(b);

        // if (binaryone.length() >= binarytwo.length()) {

        // for (int i = binaryone.length() - 1; i >= 0; i--) {

        // }
        // }

        for (int i = 0; i < a; i++) {
            b++;
        }
        return b;

    }

    public static void main(String[] args) {

        System.out.println("Sumoftwo numbers");

        convertToBinary(45);

    }

}
