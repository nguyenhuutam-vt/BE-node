public class Rectangel extends Shape{

    public int a;
    public Rectangel(int bankinh , int a){
        super(bankinh);
        this.a =a;
    }

    @Override
    public void calculatePerimeter() {
        int rec = ( a +bankinh) *2;
        System.out.println("chu vi hinh chu nhat " +rec);
    }

    @Override
    public void calculateAre() {
        int rec = a *bankinh;
        System.out.println("dien tich hinh chu nhat " +rec);
    }
}
