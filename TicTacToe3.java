import java.util.Scanner;

public class TicTacToe3 {

    // Method to read slot input
    public static int getPlayerMove() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {
        int move;

        System.out.println("=== Tic-Tac-Toe UC3 ===");

        move = getPlayerMove();

        System.out.println("You selected slot: " + move);
    }
}