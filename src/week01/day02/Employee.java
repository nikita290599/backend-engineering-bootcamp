package week01.day02;

public class Employee {

    String name;
    int id;
    String department;
    double salary;

    public Employee(
            String name,
            int id,
            String department,
            double salary
    ) {

        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;

    }

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);

    }
}