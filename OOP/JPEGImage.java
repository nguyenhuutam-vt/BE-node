public class JPEGImage extends Imgae implements  Filter{
    private int width;

    private int height;

    private int angle;

    public JPEGImage(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public void display() {
        System.out.println("Display image: ");
        System.out.println("Width: "+width);
        System.out.println("Height: " +height);
        System.out.println("Angle: "+angle);

    }

    @Override
    public void resize(int width, int height) {
        this.width= width;
        this.height=height;
        System.out.println("Resize image's width: " + width);
        System.out.println("Resize image's height: " + height);
    }

    @Override
    public void roate(int angle) {
        this.angle= angle;
        System.out.println("Rotate image: " + angle);
    }

    @Override
    public void applyFilter() {
        System.out.println("Image after apply Filter: ");
        System.out.println("Width: "+width);
        System.out.println("Height: " +height);
        System.out.println("Angle: "+angle);
    }
}
