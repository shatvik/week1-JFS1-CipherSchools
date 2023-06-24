public class Employee {
    int empID;
    int salary;
    String department;

    Employee(int employeeID, int sal, String dep) {
        empID = employeeID;
        salary = sal;
        department = dep;
    }

    public static void main(String[] args) {
        Employee rahul = new Employee(101, 30000, "testing");
        Employee varsha = new Employee(101, 50000, "Engineering");
        System.out.println(rahul.empID + " " + rahul.salary + " " + rahul.department);
        System.out.println(varsha.empID + " " + varsha.salary + " " + varsha.department);
    }
}