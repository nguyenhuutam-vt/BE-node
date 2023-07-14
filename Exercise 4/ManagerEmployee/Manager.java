package ManagerEmployee;

public class Manager extends Employee{
    
    private String department;

    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void manageTeam() {
        System.out.println("Manager is managing a team.");
    }
}
