package ManagerStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
     private String studentId;
    private String name;
    private List<Enrollment> enrollments;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        enrollments = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void enrollCourse(Course course) {
        Enrollment enrollment = new Enrollment(this, course);
        enrollments.add(enrollment);
    }

    public void dropCourse(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }
}
