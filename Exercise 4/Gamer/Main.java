package Gamer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name player 1: ");
        String name1 = sc.nextLine();
        System.out.print("Name player 2: ");
        String name2 = sc.nextLine();
        Game game = new Game(name1, name2);
        game.playGame();
    }
}
