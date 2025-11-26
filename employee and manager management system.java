import java.util.Scanner;

class Employee {
    // Access modifiers examples
    private int empId;            // private -> accessible only within this class
    String empName;               // default -> accessible in same package (here same file)
    protected double salary;      // protected -> accessible in subclass
    public String department;     // public -> accessible everywhere

    // Constructor
    public Employee(int empId, String empName, double salary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    // Public getter for private variable
    public int getEmpId() {
        return empId;
    }

    // Public method
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

// Manager class demonstrating usage of Employee
class Manager {
    public void manageEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        // Create Employee object
        Employee emp = new Employee(id, name, salary, dept);

        // Access public member directly
        System.out.println("\nDepartment (public): " + emp.department);

        // Access private member via getter
        System.out.println("Employee ID (private via getter): " + emp.getEmpId());

        // Access public method
        System.out.println("\nDisplaying full employee info:");
        emp.displayInfo();

        // Default and protected members demonstration
        System.out.println("\nDefault name (accessible in same file): " + emp.empName);
        System.out.println("Protected salary (accessible in subclass or same package): " + emp.salary);

        sc.close();
    }
}

// Main class to run the program
public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.manageEmployee();
    }
}
