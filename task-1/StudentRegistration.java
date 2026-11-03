class Student {

    String studentName;
    int rollNumber;

    void registerStudent(String name, int roll) {
        studentName = name;
        rollNumber = roll;
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class StudentRegistration {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.registerStudent("Arish", 101);
        s2.registerStudent("Kumar", 102);
        s3.registerStudent("Ravi", 103);

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}