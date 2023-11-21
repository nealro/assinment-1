import java.util.ArrayList;

public class Student {
    private static int studentIdGenerator = 1000;
    private int studentId;
    private String firstName;
    private ArrayList<Courses> courses;

    public Student(String firstName) {
        this.studentId = studentIdGenerator++;
        this.firstName = firstName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public double calculateAverageGrade() {
        if (courses.isEmpty()) {
            return 0.0;
        }

        double totalGrade = 0.0;
        for (Courses course : courses) {
            totalGrade += course.getStudentGrade();
        }

        return totalGrade / courses.size();
    }

    public void printCourses() {
        System.out.println("Courses for Student " + studentId + " (" + firstName + "):");
        for (Courses course : courses) {
            System.out.println(course);
        }
    }

    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName;
    }
}
