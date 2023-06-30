package Ex5;

public class MainEx5 {
    public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement();

        Student student = new Student(1,"tam","tam@gmail.com");
        s1.addStudent(student);
        s1.displayStident();
        s1.deleteStudent(student);
        s1.displayStident();

        Course c1 = new Course(123,"ABC");
        s1.addCourse(c1);
        s1.displaycourse();
        s1.deleteCourse(c1);
        s1.displaycourse();


        s1.enrollCourse(student,c1);
        s1.displayEnrrol();


    }
}
