package Ex5;

public class Enrollment {
    private Student student;
    private Course course;

    // Constructor
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public void displayInfoEnroll() {

        System.out.println("Student Name : " + student);
        System.out.println("Course Name : " + course);

    }
}
