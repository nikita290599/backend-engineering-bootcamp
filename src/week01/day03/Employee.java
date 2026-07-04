package week01.day03;
import java.util.Arrays;
public class Employee {

    private String name;
    private int id;
    private String department;
    private double salary;
    public Employee(
            String name,
            int id,
            String department,
            double salary
    ){

        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            System.out.println("Name cannot be empty.");
            return;
        }

        this.name = name;

    }

    public void setId(int id) {
       if(id<=0) {
         System.out.println("ID cannot be less than 1");
         return;
       }
        this.id = id;

    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Salary cannot be negative.");
            return;
        }

        this.salary = salary;

    }
}
