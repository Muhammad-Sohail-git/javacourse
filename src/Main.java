// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sohail", "28/08/1996", "12/12/2060", "12/12/2012");
        System.out.println(employee);
        System.out.println("Age= "+ employee.getAge());
        System.out.println("Termination Date= "+ employee.endDate);

        SalariedEmployee employee1 = new SalariedEmployee("Malik", "28/08/1990", "12/12/2013", "12/12/2011", 2000);
        System.out.println(employee1);
        System.out.println("Age= "+ employee1.getAge());
        System.out.println("Pay= "+ employee1.collectPay());
        System.out.println("Termination Date= "+ employee1.isRetired);
        System.out.println("Annual Salary= "+ employee1.annualSalary);
        System.out.println("Malik's Pay check= "+ employee1.collectPay());
    }
}