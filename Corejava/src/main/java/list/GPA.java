package list;

import java.util.ArrayList;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class GPA {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add students to the list
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Alice", "Smith", 3.2));
        students.add(new Student("Bob", "Johnson", 3.8));
        students.add(new Student("Emily", "Davis", 3.9));

        // Calculate the average GPA
     
        double totalGpa = 0;
        for (Student student : students) {
            totalGpa += student.gpa;
        }
        totalGpa /= students.size();

        // Remove students with GPA less than the average
        List<Student> remainingStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.gpa >= totalGpa) {
                remainingStudents.add(student);
            }
        }

        // Print the remaining students
        System.out.println("Students with GPA >= " + totalGpa);
        for (Student student : remainingStudents) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }
}
