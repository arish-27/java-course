class Employee {

    String employeeName = "Arish";

    double calculateSalary(double basic, double allowance) {
        return basic + allowance;
    }

    double calculateNetSalary(double gross, double deduction) {
        return gross - deduction;
    }

    void displayDetails(double gross, double net) {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Employee emp = new Employee();

        double gross = emp.calculateSalary(25000, 5000);
        double net = emp.calculateNetSalary(gross, 2000);

        emp.displayDetails(gross, net);
    }
}