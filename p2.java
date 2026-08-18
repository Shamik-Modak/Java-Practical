// Superclass
class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        System.out.println("Base Salary: Rs." + baseSalary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Total Salary: Rs." + totalSalary);
        System.out.println();
    }
}

// Subclass: Programmer
class Programmer extends Employee {
    double bonus;

    Programmer(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer Total Salary: Rs." + totalSalary);
    }
}

// Main class
public class p2 {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");

        // Using parent class references
        Employee emp1 = new Manager("Samyak", 80000.0, 15000.0);
        Employee emp2 = new Programmer("Shamik", 90000.0, 15000.0);

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}