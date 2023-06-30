 class SportCar extends Carr{
    private int price;
    public SportCar(String brand , String color , int price){
        super(brand,color);
        this.price = price;
    }

    @Override
    public void start(){
        System.out.println("Sport car is starting");
    }

    public void displayInfo(){
        System.out.println("======== Display inFor ========");
        super.displayInfo();
        System.out.println("Price "+ price);
    }

}
