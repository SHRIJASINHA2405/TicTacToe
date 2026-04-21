import java.util.Scanner;

public class TicTacToe4 {

    // Method to get slot input
    public static int getPlayerMove() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    // Method to convert slot into row and column
    public static void convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row Index: " + row);
        System.out.println("Column Index: " + col);
    }

    public static void main(String[] args) {
        int slot;

        System.out.println("=== Tic-Tac-Toe UC4 ===");

        slot = getPlayerMove();

        convertSlot(slot);
    }
}