package leetcode75;

public class WordSearch {

    public static boolean checkExhistance(char[][] board, String word, int i, int j) {

        int rows = board.length;
        int cols = board[0].length;

        if (i - 1 >= 0 && j - 1 >= cols) {
            if (board[i - 1][j - 1] == word.charAt(0)) {
                checkExhistance(board, word.substring(1), i - 1, j - 1);
            }
        }

        if (i + 1 < rows && j + 1 < cols) {
            if (board[i + 1][j + 1] == word.charAt(0)) {
                checkExhistance(board, word.substring(1), i + 1, j + 1);
            }
        }

        if (i - 1 < rows && j + 1 < cols) {
            if (board[i - 1][j + 1] == word.charAt(0)) {
                checkExhistance(board, word.substring(1), i + 1, j + 1);
            }
        }

        if (word.charAt(0) == board[i][j]) {

        }

    }

    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Word Search");
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

        String word = "ABCCED";

        boolean answer = exist(board, word);
        System.out.println(answer);
    }
}
