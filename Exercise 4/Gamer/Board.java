package Gamer;

public class Board {
    private char[][] board;
    int size;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j]);
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---------");
            }
        }
    }

    public boolean isEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkMove(int row, int col, char symbol) {
        if (isEmpty(row, col)) {
            board[row][col] = symbol;
            return true;
        } else {
            System.out.println("This box is selected. Please select another box.");
            return false;
        }
    }

    public boolean check(char key) {
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != key) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        for (int j = 0; j < size; j++) {
            boolean win = true;
            for (int i = 0; i < size; i++) {
                if (board[i][j] != key) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        // lay key de Check value
        boolean win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != key) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }
        
        win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != key) {
                win = false;
                break;
            }
        }
        return win;
    }
}
