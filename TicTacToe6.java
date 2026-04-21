public class TicTacToe6 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;
        char symbol = 'X';

        placeMove(row, col, symbol);

        // check output
        System.out.println("Updated Cell: " + board[row][col]);
    }

    // Move place karne ka method
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}