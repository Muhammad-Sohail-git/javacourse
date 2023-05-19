public class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name,birthDate, endDate);
        this.employeeID = Employee.employeeNo ++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmployeeID: " + employeeID + ", HireDate: " + hireDate + super.toString();
    }
}
