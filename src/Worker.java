import java.time.LocalDate;

public class Worker {
    private String name;
    private String surname;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate, String surname) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(0,4));
        return (currentYear-birthYear);
    }
    public String getFullName() {
        return name + " " + surname;
    }
    public double collectPay() {
        return 0.0;
    }
    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public boolean isRetired(){
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(LocalDate.parse(endDate));
    }
    @Override
    public String toString() {
        return " name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate;
    }
}
