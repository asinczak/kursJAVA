package pl.com.ttpsc.kursJava.wyklad_8;

import java.util.Scanner;

public class HR {

    private Employee[] employees;
    private int employment;
    static int licznik = 0;


    public HR() throws EmploymnetException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Employment");
        this.employment = scan.nextInt();
        this.employees = new Employee[employment];

        if (employment >= 7) {
                throw new EmploymnetException();
            }
    }


    public void addEmployee(Employee employee) {
        employees[licznik] = employee;
                licznik++;
    }

    public void addEmployeeInteractivly() {
        System.out.println("New employee :");

        Scanner scanner = new Scanner(System.in);
        System.out.println("name : ");
        String name = scanner.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("surname : ");
        String surname = scanner2.next();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("salary : ");
        double salary = scanner3.nextDouble();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("male/female : ");
        char male_female = scanner4.next().charAt(0);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("department : ");
        int department = scanner5.nextInt();

        Employee employee6 = new Employee(name, surname, salary, male_female, department);
        System.out.println(employee6);
        this.addEmployee(employee6);
    }

    public void averageSalary() {
        double averageSalary = 0;
        for (int i = 0; i < employment; i++) {
            averageSalary = averageSalary + employees[i].getSalary() / employees.length;
        }
        System.out.println("The average salary in the company: " + averageSalary);
    }

    public void averageSalaryInDepart(int department) {
        double averageSalary = 0;
        int licznik = 1;
        for (int i = 0; i < employment; i++) {
            if (employees[i].getDepartment() == department) {
                averageSalary = (averageSalary + employees[i].getSalary()) / licznik;
                licznik++;
            }
        }
        System.out.println("The average salary in department " + department + " : " + averageSalary);
    }

    public void displayDepartments() {
        for(int i = 0; i <employees.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (employees[i].getDepartment() == employees[j].getDepartment()) {
                    break;
                }
            }
            if (i==j) {
                System.out.println("Departments in company :" + employees[i].getDepartment());
            }
}
    }

    public void displayAllEmloyeesOfDep(int departemnt) {
        System.out.println("Employees in department " + departemnt + " :");
        for (int i = 0; i < employment; i++) {
            if (employees[i].getDepartment() == departemnt) {
                System.out.println(employees[i]);
            }
        }
    }

    public void displayAllEmployees() {
        System.out.println("All employees in company :");
        for (int i = 0; i < employment; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {

        HR hr = null;

        do {
            try {
                hr = new HR();
                break;
            } catch (EmploymnetException employmnetException) {
                System.out.println(employmnetException.getMessage());
            }
        } while (true);

        Employee employee1 = new Employee("Jan", "Szewczyk", 3000, 'm', 3);
        Employee employee2 = new Employee("Kaja", "Kajak", 5000, 'f', 2);
        Employee employee3 = new Employee("Tomasz", "Ochota", 4000, 'm', 3);
        Employee employee4 = new Employee("Maja", "Szyszka", 2900, 'f', 4);
        Employee employee5 = new Employee("Łukasz", "Pączek", 4500, 'm', 4);

        hr.addEmployee(employee1);
        hr.addEmployee(employee2);
        hr.addEmployee(employee3);
        hr.addEmployee(employee4);
        hr.addEmployee(employee5);
        hr.addEmployeeInteractivly();

        hr.averageSalary();
        hr.averageSalaryInDepart(3);
        hr.displayDepartments();
        hr.displayAllEmloyeesOfDep(4);

        hr.displayAllEmployees();


    }

    }






