public class Car {
    private String brand;
    private String color;
    private int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start(){
        System.out.println("the car is starting");
    }

    public void drive(){
        System.out.println("the car is driving");

    }
    public  void stop(){
        System.out.println("the car has stopped");
    }

    public void displayInfo(){
        System.out.println("brand "+brand);
        System.out.println("color "+ color);
        System.out.println("Year "+year);

    }
}
