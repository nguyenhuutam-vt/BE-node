package Gamer;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(String name1, String name2) {
        board = new Board(3);
        player1 = new Player(name1, 'X');
        player2 = new Player(name2, 'O');
        currentPlayer = player1; 
    }
    
    public void playGame() {
        board.printBoard();
        while (true) {
            System.out.println(currentPlayer.getName() + ", it's your turn.");
            int row = getValidInput("Enter the row number (0-" + (board.size - 1) + "): ");
            int col = getValidInput("Enter the number of columns (0-" + (board.size - 1) + "): ");

            if (board.checkMove(row, col, currentPlayer.getKey())) {
                board.printBoard();

                if (board.check(currentPlayer.getKey())) {
                    System.out.println("Congratulations " + currentPlayer.getName() + "! You win.");
                    break;
                } else if (board.isFull()) {
                    System.out.println("The game ends. No player win.");
                    break;
                }

                // Chuyển lượt đi cho người chơi tiếp theo
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
     
    private int getValidInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 0 && input < board.size) {
                    break;
                } else {
                    System.out.println("Invalid number entered. Please enter again.");
                }
            } else {
                System.out.println("Invalid number entered. Please enter again.");
                scanner.next();
            }
        }

        return input;
    }
}
