public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.annualSalary = annualSalary;
    }
    public double collectPay() {
        return (int) annualSalary/12;
    }
    public void retired(){
        terminate("12/12/1234");
        isRetired = true;
    }
}
