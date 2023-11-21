public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Leo");
        Student student2 = new Student("neal");
        Student student3 = new Student("nero");

        Courses course1 = new Courses("Math", 97);
        Courses course2 = new Courses("Science", 86);
        Courses course3 = new Courses("History", 49.9);

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course3);
        student3.addCourse(course1);
        student3.addCourse(course2);
        student3.addCourse(course3);

        System.out.println(student1);
        System.out.println("Average Grade: " + student1.calculateAverageGrade());
        student1.printCourses();

        System.out.println();

        System.out.println(student2);
        System.out.println("Average Grade: " + student2.calculateAverageGrade());
        student2.printCourses();

        System.out.println();

        System.out.println(student3);
        System.out.println("Average Grade: " + student3.calculateAverageGrade());
        student3.printCourses();
    }
}