public class Employee{
public static void main(String[] args){
    System.out.println(Employee.displayEmployeeDetails("Nikita","ni290599","Consulting",34500));
}
    public static String displayEmployeeDetails(String EmpName, String EmpId , String Dep, int Salary){
        return "Employee Name: "+EmpName+"Employee Id: "+EmpId+"Employee Department: "+Dep+"Employee Salary: "+Salary;
    }
}
