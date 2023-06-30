public class Circle extends Shape {
    private double r;
    public Circle (int bankinh ,double r){
        super(bankinh);
        this.r=r;
    }

     @Override
     public void calculateAre() {
         double s = 2 * r * bankinh;
         System.out.println("chu vi hinh tron " + s);
     }

     @Override
     public void calculatePerimeter() {
         double s = r * bankinh;
         System.out.println("dien tinh hinh tron " + s);
     }
 }
