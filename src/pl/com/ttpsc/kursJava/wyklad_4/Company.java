package pl.com.ttpsc.kursJava.wyklad_4;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name = "Jan";
        employee1.surname = "Kowalski";
        employee1.age = 40;

        employee2.name = "Zuzanna";
        employee2.surname = "Kot";
        employee2.age = 35;

        System.out.println("Pracownicy firmy to: ");
        System.out.println(employee1.name + " " + employee1.surname + " lat " + employee1.age);
        System.out.println(employee2.name + " " + employee2.surname + " lat " + employee2.age);


        // Zmodyfikuj powyższy program tak, aby utworzyć trzech pracowników, a odpowiednie pola zainicjuj
        // wartościami z wcześniej utworzonych tablic (dowolne dane) przy użyciu pętli.

        Employee employees [] = new Employee[3];

        String names [] = {"Jan", "Zuzanna", "Tomek"};
        String surnames [] = {"Kowalski", "Kot", "Lipiec"};
        int age [] = {40, 35, 30};


        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].name = names[i];
            employees[i].surname = surnames[i];
            employees[i].age = age[i];
        }
        System.out.println("DRUGA WERSJA :");
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees [i].name +" "+ employees [i].surname + " lat " + employees [i].age);
        }
    }
}
