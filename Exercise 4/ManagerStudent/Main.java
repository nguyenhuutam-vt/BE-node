package ManagerStudent;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S1", "Billion");
        Student student2 = new Student("S2", "Ty");

        // Create courses
        Course course1 = new Course("C1", "Programming");
        Course course2 = new Course("C2", "java developer");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Drop a course
        Enrollment enrollment = student1.getEnrollments().get(0);
        student1.dropCourse(enrollment);

        // Print student enrollments
        System.out.println("Student: " + student1.getName());
        System.out.println("Enrollments:");
        for (Enrollment e : student1.getEnrollments()) {
            System.out.println("- " + e.getCourse().getName());
        }
    }
}
