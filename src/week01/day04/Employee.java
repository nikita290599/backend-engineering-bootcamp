package week01.day04;

public class Employee {
    private int empId;
    private String empName;
    private double Salary;

    public Employee(
            int empId,
            String empName,
            double Salary
    ){
      this.empId = empId;
      this.empName = empName;
      this.Salary = Salary;
    }
    public void display(){
        System.out.println("empId:"+empId);
        System.out.println("empName:"+empName);
        System.out.println("EmSalary:"+Salary);
    }
}
