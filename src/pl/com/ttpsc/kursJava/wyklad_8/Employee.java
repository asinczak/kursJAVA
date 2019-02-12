package pl.com.ttpsc.kursJava.wyklad_8;

public class Employee implements MinimumSalary{

    private String name;
    private  String surname;
    private  double salary;
    private char male_female;
    private  int department;


    public Employee(String name, String surname, double salary, char male_female, int department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.male_female = male_female;
        this.department = department;

        try {
            if (salary < minimumSalary) {
                throw new SalaryException();
            }
        } catch (SalaryException e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString () {
        return "" + name +" "+ surname +", "+ salary +", "+ male_female+", "+ department;
    }

    public boolean doesWorkInDepart (int department) {
        if (this.department == department);
        return true;
    }

    public double getSalary () {
        return salary;
    }

    public int getDepartment () {
        return department;
    }

    public void theMinimumSalary () {

    }
}
