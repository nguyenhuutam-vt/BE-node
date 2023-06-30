public class Triangle  extends Shape{
    private int chieucao;
    private int a;
    private int b;
    private int c;
    public Triangle(int bankinh , int chieucao , int a, int b, int c ){
        super(bankinh);
        this.chieucao = chieucao;
        this.a = a;
        this.b= b;
        this.c = c;
    }


    @Override
    public void calculatePerimeter() {
        int sum = a + b +c;
        System.out.println("chu vi tam giac " +sum);
    }

    @Override
    public void calculateAre() {
        int tri =  (chieucao * bankinh) * 1/2;
        System.out.println("dien tich tam giac " + tri);
    }
}
