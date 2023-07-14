package ManagerEmployee;

public class Engineer extends Employee{
    
    private String specialization;

    public Engineer(String name, String employeeId, double salary, String specialization) {
        super(name, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void developSoftware() {
        System.out.println("Engineer is developing software.");
    }
}
