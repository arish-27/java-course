
    class Employee {

    static int employeeCount = 0;

    String employeeName;
    int employeeId;

    void registerEmployee(String name, int id) {

        employeeName = name;
        employeeId = id;

        employeeCount++;
    }

    void displayEmployee() {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class EmployeeCounter {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.registerEmployee("Arish", 201);
        e2.registerEmployee("Vijay", 202);
        e3.registerEmployee("Ajith", 203);

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();

        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}

