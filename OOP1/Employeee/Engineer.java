public class Engineer extends Employee{
    public String specialization;

    public Engineer(String name, String id, String address , String specialization) {
        super(name, id, address);
        this.specialization = specialization;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("specialization : " + specialization);
    }
}
