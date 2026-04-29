public class TicTacToe9 {

    static char[][] board = {
            {'X', 'X', 'X'},
            {'O', ' ', 'O'},
            {' ', ' ', ' '}
    };

    // Display board
    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    // UC9: Check winner
    public static boolean checkWin(char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        displayBoard();

        // Check for winner after move
        if (checkWin('X')) {
            System.out.println("Player X wins!");
        } else if (checkWin('O')) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}