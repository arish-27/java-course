class Student {

    int calculateTotal(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    double calculateAverage(int total) {
        return total / 5.0;
    }

    String calculateGrade(double average) {

        if (average >= 90)
            return "A";
        else if (average >= 75)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "Fail";
    }

    void displayResult(int total, double average, String grade) {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentResult {

    public static void main(String[] args) {

        Student s = new Student();

        int total = s.calculateTotal(85, 78, 92, 88, 77);
        double average = s.calculateAverage(total);
        String grade = s.calculateGrade(average);

        s.displayResult(total, average, grade);
    }
}