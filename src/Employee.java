public class Employee extends Worker{
    private long employeeID;
    private String hireDate;


    private static int employeeNo = 1;
    public boolean isRetired= isRetired();

    public Employee(String name, String birthDate, String endDate, String hireDate, String surname) {
        super(name,birthDate, endDate,surname);
        this.employeeID = Employee.employeeNo ++;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "EmployeeID: " + employeeID + ", HireDate: " + hireDate + super.toString();
    }
}
