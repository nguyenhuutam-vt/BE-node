package Employeee;

public class Manager extends  Employee{
    public  int price;
    public Manager(String name, String id, String address , int price) {
        super(name, id, address);
        this.price = price;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Price : " + price);
    }
}
