package CarRacing;

public class Car {
    private static final char CAR_CHAR = 'O';
    private int position;

    public Car(int initialPosition) {
        this.position = initialPosition;
    }

    public int getPosition() {
        return position;
    }

    public void moveLeft() {
        position = Math.max(0, position - 1);
    }

    public void moveRight(int trackLength) {
        position = Math.min(trackLength - 1, position + 1);
    }

    public void draw(int trackLength) {
        for (int i = 0; i < trackLength; i++) {
            if (i == position) {
                System.out.print(CAR_CHAR);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
