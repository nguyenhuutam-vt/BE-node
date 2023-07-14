package CarRacing;

public class Main {
    public static void main(String[] args) {
        String playerName = "Player1";
        String[] carNames = {"Car1", "Car2", "Car3"};
        Game game = new Game(playerName, carNames);
        game.playGame();
    }
}
