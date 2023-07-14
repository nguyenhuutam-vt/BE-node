package Gamer;

public class Player {
    private String name;
    private char key;

    public Player(String name, char key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public char getKey() {
        return key;
    }
}
