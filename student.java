package Siri;

public class Student {
    // Instance variables
    private String name;
    private int age;
    private double grade;

    // Constructor to initialize the instance variables
    public demo17(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 1. Method without parameter and without return
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // 2. Method with parameter and without return
    public void updateGrade(double newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }

    // 3. Method without parameter and with return
    public double getGrade() {
        return grade;
    }

    // 4. Method with parameter and with return
    public String getStatus(double passingGrade) {
        if (grade >= passingGrade) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();

        // Calling method without parameter and without return
        student.displayDetails();

        // Calling method with parameter and without return
        student.updateGrade(90.0);

        // Calling method without parameter and with return
        double currentGrade = student.getGrade();
        System.out.println("Current Grade: " + currentGrade);

        // Calling method with parameter and with return
        String status = student.getStatus(50.0);
        System.out.println("Status: " + status);
    }
}



