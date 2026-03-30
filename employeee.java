// Employee class
class Employee {
    String name;
    int id;
    static int employeeCount = 0; // static variable to track number of employees

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment count every time an employee is created
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    // Static method to display total number of employees
    static void displayEmployeeCount() {
        System.out.println("Total employees created: " + employeeCount);
    }
}

// Main public class (must match file name)
public class Company {
    public static void main(String[] args) {
        // Create multiple Employee objects
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);
        Employee e4 = new Employee("David", 104);

        // Display employee details
        e1.display();
        e2.display();
        e3.display();
        e4.display();

        // Display total number of employees
        Employee.displayEmployeeCount();
    }
}