package CarRacing;

public class Game {
    private Car[] cars;
    private Player player;

    public Game(String playerName, String[] carNames) {
        this.player = new Player(playerName);
        this.cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
    }

    public void playGame() {
        System.out.println("Start!");

        while (true) {
            System.out.println("------ Round New ------");
            for (Car car : cars) {
                car.move();
                if (car.getPosition() >= 10) {
                    System.out.println(car.getName() + " reached the finish line!");
                    player.increaseScore();
                    if (player.getScore() == cars.length) {
                        System.out.println("Congratulations " + player.getName() + "! You win.");
                        return;
                    }
                }
            }
            System.out.println();

            try {
                Thread.sleep(1000); // Delay 1 giây trước khi di chuyển xe tiếp theo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
