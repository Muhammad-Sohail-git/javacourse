public class SalariedEmployee extends Employee {
    double annualSalary;
     public  boolean isRetired = super.isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary, String surname) {
        super(name, birthDate, endDate, hireDate,surname);
        this.annualSalary = annualSalary;
        this.annualSalary = annualSalary;
    }
    public double collectPay() {
        return (int) annualSalary/12;
    }

}
