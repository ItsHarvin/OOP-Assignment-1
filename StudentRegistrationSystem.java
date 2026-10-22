import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistrationSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        // Repeat the menu until the user exits
        do {
            System.out.println("\n=== STUDENT REGISTRATION SYSTEM ===");
            System.out.println("1. Register Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Course");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            // Select an operation based on the user's choice
            switch (choice) {

                case 1:
                    registerStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    removeStudent();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        input.close();
    }

    // Register a new student
    public static void registerStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        // Check whether the student ID already exists
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        Student student = new Student(
            id, name, age, email, phone, course, "Registered"
        );

        students.add(student);

        System.out.println("Student registered successfully!");
    }

    // Display all registered students
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student s : students) {
                System.out.println("\n--------------------");
                s.displayDetails();
            }
        }
    }

    // Search for a student using their ID
    public static void searchStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                s.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update a student's course
    public static void updateStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {

                System.out.print("Enter New Course: ");
                String course = input.nextLine();

                s.setCourse(course);

                System.out.println("Course updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Remove a student's registration
    public static void removeStudent() {

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                students.remove(s);
                System.out.println("Student removed successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}