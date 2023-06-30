abstract class  Carr {
    private String brand;
    private String color;

    public Carr(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start() ;
    public  void stop(){
        System.out.println("the car has stopped");
    }
    public void displayInfo(){

        System.out.println("brand "+brand);
        System.out.println("color "+ color);


    }
}
