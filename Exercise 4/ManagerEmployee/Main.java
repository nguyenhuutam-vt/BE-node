package ManagerEmployee;

public class Main {
    public static void main(String[] args) {
        // Tạo một nhân viên
        Employee employee = new Employee("Billion", "Ep01", 5000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Salary: " + employee.getSalary());
        employee.work();
        System.out.println();

        // Tạo một quản lý
        Manager manager = new Manager("Billion", "M01", 8000, "Sales");
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager ID: " + manager.getEmployeeId());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());
        manager.work();
        manager.manageTeam();
        System.out.println();
        // Tạo một kỹ sư
        Engineer engineer = new Engineer("Billion", "Eg01", 6000, "Backend Development");
        System.out.println("Engineer Name: " + engineer.getName());
        System.out.println("Engineer ID: " + engineer.getEmployeeId());
        System.out.println("Engineer Salary: " + engineer.getSalary());
        System.out.println("Engineer Specialization: " + engineer.getSpecialization());
        engineer.work();
        engineer.developSoftware();
    }
}
