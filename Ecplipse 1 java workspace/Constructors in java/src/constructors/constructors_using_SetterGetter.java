package constructors;

class Employee {
    private int id;
    private String name;
    private float salary;

    // Constructor
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    // Extra method
    public void raiseSalary(float amount) {
        this.salary += amount;
    }
}


public class constructors_using_SetterGetter {
    public static void main(String[] args) {
        Employee emp = new Employee(143, "Raunak", 125000.50f);

        System.out.println("Employee ID:\t\t" + emp.getId());
        System.out.println("Employee Name:\t\t" + emp.getName());
        System.out.println("Employee Salary:\t" + emp.getSalary());

        // Raise salary
        emp.raiseSalary(5000);
        System.out.println("After Raise:\t\t" + emp.getSalary());
    }
}

