// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sohail", "1996-08-23", "2996-08-23", "1996-08-23", "Khan");
        System.out.println(employee);
        System.out.println("Age= "+ employee.getAge());
        System.out.println("Termination Date= "+ employee.endDate);
        System.out.println("Is Terminated: "+ employee.isRetired);
        System.out.println("Pay= "+ employee.collectPay());

        SalariedEmployee employee1 = new SalariedEmployee("Malik", "1996-08-23", "2996-08-23", "1996-08-23", 2000,"Sohail");
        System.out.println(employee1);
        System.out.println("Age= "+ employee1.getAge());
        System.out.println("Pay= "+ employee1.collectPay());
        System.out.println("termination date:" + employee1.endDate);
        System.out.println("Is Terminated: "+ employee1.isRetired);
        System.out.println("Annual Salary= "+ employee1.annualSalary);
        System.out.println("Malik's Pay check= "+ employee1.collectPay());
    }
}