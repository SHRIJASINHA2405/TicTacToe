import java.util.Random;

public class TicTacToe7 {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    // Display board
    static void showBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i]);
            if ((i + 1) % 3 == 0)
                System.out.println();
            else
                System.out.print(" | ");
        }
        System.out.println();
    }

    // UC7: Computer random valid move
    static void computerMove() {
        Random rand = new Random();
        int pos;

        // loop until empty position found
        do {
            pos = rand.nextInt(9); // 0–8
        } while (board[pos] != ' ');

        board[pos] = 'O'; // computer move
        System.out.println("Computer chose position: " + (pos + 1));
    }

    public static void main(String[] args) {

        System.out.println("Initial Board:");
        showBoard();

        computerMove();

        System.out.println("After Computer Move:");
        showBoard();
    }
}