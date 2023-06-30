package Ex5;

public class Course {
    private int courseId;
    private String courseName;

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters and Setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void displayInfoCourse() {
        System.out.println("StudentId : " + courseId);
        System.out.println("Course Name : " + courseName);

    }
}
