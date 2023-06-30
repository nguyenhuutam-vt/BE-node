package CarRacing;

import java.util.Scanner;

public class Player {
    private static final char LEFT_INPUT = 'a';
    private static final char RIGHT_INPUT = 'd';
    private static final char QUIT_INPUT = 'q';
    private char lastInput;

    public char getLastInput() {
        return lastInput;
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        lastInput = scanner.nextLine().charAt(0);
    }

    public boolean wantsToQuit() {
        return lastInput == QUIT_INPUT;
    }

    public boolean wantsToMoveLeft() {
        return lastInput == LEFT_INPUT;
    }

    public boolean wantsToMoveRight() {
        return lastInput == RIGHT_INPUT;
    }
}
