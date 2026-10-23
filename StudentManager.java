import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
            System.out.println("--------------------");
        }
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}