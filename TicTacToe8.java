import java.util.Scanner;
import java.util.Random;

public class TicTacToe8 {

    static char[][] board = new char[3][3];

    // Initialize board
    public static void initBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    // Display board
    public static void displayBoard() {
        int slot = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    System.out.print(slot);
                else
                    System.out.print(board[i][j]);

                if (j < 2) System.out.print(" | ");
                slot++;
            }
            System.out.println();
            if (i < 2) System.out.println("--+---+--");
        }
    }

    // Validate move (reuse UC5)
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Place move
    public static void placeMove(int row, int col, char player) {
        board[row][col] = player;
    }

    // Check win
    public static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;

        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }

    // Computer move (UC7 reuse)
    public static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(row, col)) {
                placeMove(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initBoard();

        boolean gameOver = false;
        char currentPlayer = 'X'; // Player starts

        System.out.println("Tic Tac Toe Game Start!");

        // UC8: Game Loop
        while (!gameOver) {

            displayBoard();

            if (currentPlayer == 'X') {
                // Player move
                System.out.print("Enter slot (1-9): ");
                int slot = sc.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (isValidMove(row, col)) {
                    placeMove(row, col, 'X');
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue; // retry same player
                }

            } else {
                // Computer move
                computerMove();
            }

            // Check win
            if (checkWin(currentPlayer)) {
                displayBoard();
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isDraw()) {
                displayBoard();
                System.out.println("Game is a Draw!");
                gameOver = true;
            }
            // Switch turn
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }
}