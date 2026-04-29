public class TicTacToe10 {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    // Display board
    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }

    // UC10: Check Draw
    public static boolean isDraw() {

        // Traverse board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any cell is empty → not draw
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }

    public static void main(String[] args) {

        displayBoard();

        // Check draw condition
        if (isDraw()) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println("Moves still available.");
        }
    }
}