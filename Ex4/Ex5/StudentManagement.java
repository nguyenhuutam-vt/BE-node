package Ex5;

import Bookk.Book;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement{
    private List<Student> students;
    private List<Course> courses;
    private List<Enrollment> enrollments;

    public StudentManagement() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    // Thêm sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayStident() {
        if (students.isEmpty()) {
            System.out.println("The library has no Student currently.");
        } else {
            System.out.println("Library Books:");
            for (Student student : students) {
                student.displayInfo();
                System.out.println("----------");
            }
        }
    }

    // Xóa sinh viên
    public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Delete Success");
    }


    // Thêm khóa học
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void displaycourse() {
        if (courses.isEmpty()) {
            System.out.println("The Course has no Course currently.");
        } else {
            System.out.println(" Course:");
            for (Course course : courses) {
                course.displayInfoCourse();
                System.out.println("----------");
            }
        }
    }
    // Xóa khóa học
    public void deleteCourse(Course course) {
        courses.remove(course);
        System.out.println("delete Course success");
    }

    // Đăng ký học phần
    public void enrollCourse(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
        System.out.println("Dang ki success");

    }
    public void displayEnrrol(){
        if (enrollments.isEmpty()) {
            System.out.println("The Course has no Course currently.");
        } else {
            System.out.println(" Enroll:");
            for (Enrollment enrollment1 : enrollments) {
                enrollment1.displayInfoEnroll();
                System.out.println("----------");
            }
        }
    }

    // Hủy đăng ký học phần
    public void cancelEnrollment(Student student, Course course) {
        Enrollment enrollment = findEnrollment(student, course);
        if (enrollment != null) {
            enrollments.remove(enrollment);
        }
    }

    // Tìm kiếm đăng ký học phần
    private Enrollment findEnrollment(Student student, Course course) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student) && enrollment.getCourse().equals(course)) {
                return enrollment;
            }
        }
        return null;
    }
}
