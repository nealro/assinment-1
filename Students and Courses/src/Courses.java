public class Courses {
    private String subjectName;
    private double studentGrade;

    public Courses(String subjectName, double studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public String toString() {
        return subjectName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }
}
