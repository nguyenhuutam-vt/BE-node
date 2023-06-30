package Ex5;

public class Student {
    private int studentId;
    private String name;
    private String email;

    // Constructor
    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void displayInfo() {
        System.out.println("StudentId : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }
}
