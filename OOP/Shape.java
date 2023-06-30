abstract class Shape {
    public int bankinh;

    public Shape(int bankinh) {
        this.bankinh = bankinh;
    }

    public abstract void calculateAre();

    public abstract void calculatePerimeter();
}
