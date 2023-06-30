package CarRacing;

public class Game {
    private static final int TRACK_LENGTH = 10;
    private static final char TRACK_CHAR = '-';
    private static final int POINTS_PER_STEP = 10;
    private static final char OBSTACLE = 'b';
    private Car car;
    private Player player;
    private int score;

    public Game() {
        this.car = new Car(TRACK_LENGTH / 2);
        this.player = new Player();
        this.score = 0;
    }

    public void start() {
        System.out.println("Welcome to Car Racing Game!");
        System.out.println("Use 'a' to move left, 'd' to move right, and 'q' to quit.");

        while (true) {
            System.out.println("Score: " + score);
            drawTrack();
            drawObstacle();
            car.draw(TRACK_LENGTH);
            player.readInput();

            if (player.wantsToQuit()) {
                break;
            }
            if (player.wantsToMoveLeft()) {
                car.moveLeft();
            } else if (player.wantsToMoveRight()) {
                car.moveRight(TRACK_LENGTH);
            }
            if(obstacle(car.getPosition())){
                break;
            }

            score += POINTS_PER_STEP;
        }

        System.out.println("Game over! Final score: " + score);
    }

    private void drawTrack() {
        for (int i = 0; i < TRACK_LENGTH; i++) {
            System.out.print(TRACK_CHAR);
        }
        System.out.println();
    }

    private boolean obstacle(int carPosition){
        int position = (int) (Math.random() * TRACK_LENGTH) - 1;
        return position == carPosition;
    }
    private void drawObstacle(){
        int position = (int) Math.ceil(Math.random() * TRACK_LENGTH) - 1;
        for (int i = 0; i < TRACK_LENGTH; i++) {
            if (i == position) {
                System.out.print(OBSTACLE);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
