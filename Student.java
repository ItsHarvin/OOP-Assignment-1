public class Student {

    // Private attributes
    private String studentId;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String course;
    private String status;

    // Default constructor
    public Student() {
        studentId = "";
        name = "";
        age = 0;
        email = "";
        phoneNumber = "";
        course = "";
        status = "Pending";
    }

    // Parameterized constructor
    public Student(String studentId, String name, int age,
                   String email, String phoneNumber,
                   String course, String status) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.status = status;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Additional method 1
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Course: " + course);
        System.out.println("Status: " + status);
    }

    // Additional method 2
    public boolean isRegistered() {
        return status.equalsIgnoreCase("Registered");
    }

    // Additional method 3
    public void updateCourse(String course) {
        this.course = course;
    }
}