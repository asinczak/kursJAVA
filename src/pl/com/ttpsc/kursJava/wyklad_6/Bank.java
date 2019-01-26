package pl.com.ttpsc.kursJava.wyklad_6;

//Stwórz klasę Bank i Konto. Klasa Bank może posiadać wiele kąt (dla wielu klientów)
//a. Klasa konto reprezentuje sumę pieniędzy dla konkretnego klienta. Zawiera imię i nazwisko klienta oraz sumę
// pieniędzy zgromadzoną na koncie
//b. Obiekt klasy konto można stworzyć podając imię, nazwisko i początkową kwotę pieniędzy
//    i.     Kwota nie może być mniejsza od 0. Jeśli taka kwota zostanie podana np. -10, na ekranie powinno się wypisać,
//    że nie można stworzyć konta z ujemnym saldem
//    ii.     Klasa konto powinna posiadać możliwość zwiększenie lub zmniejszenia salda o konkretną (podaną) kwotę
//c. Klasa Bank powinna mieć możliwość dodawania kolejnych kont
//    i.     liczba kont nie jest z góry znana i w każdej chwili może się zmienić
//d.      Klasa bank powinna mieć możliwość usunięcia konta dla klienta po nazwisku – metoda przyjmuje nazwisko i wyszukuje konto do usunięcia
//e.      Klasa bank powinna mieć możliwość wyświetlenie na ekranie wszystkich kont z ich danymi (imię, nazwisko, saldo)

import java.util.ArrayList;

public class Bank {

    static ArrayList<Account> numberOfaccounts = new ArrayList<Account>();

    static void closeAccount (String surname) {
        for (int i = 0; i < numberOfaccounts.size(); i++){
            if (numberOfaccounts.get(i).surname == surname){
                System.out.println("Account to closed: " + numberOfaccounts.get(i).surname);
            }
        }
    }


   static void displayAccount () {
        for (int i = 0; i < numberOfaccounts.size(); i++){
            System.out.println("Account: 1.name & surmname: " +numberOfaccounts.get(i).name +" "+ numberOfaccounts.get(i).surname + " 2.balance: " + numberOfaccounts.get(i).balanceAccount);
        }
    }


    public static void main(String[] args) {

        Account account1 = new Account("Jan", "Grzeczny", 123589.23);
        Account account2 = new Account("Maja", "Niegrzeczna", -100.00);
        Account account3 = new Account("Tomek", "Szybki", 1589.03);
        Account account4 = new Account("Barbara", "Wolna", 1569823.25);

        numberOfaccounts.add(account1);
        numberOfaccounts.add(account2);
        numberOfaccounts.add(account3);
        numberOfaccounts.add(account4);


        Bank.displayAccount();

        System.out.println("Increasing balance of Mrs. Niegrzeczna: " + account2.balanceIncrease(100000.00));
        System.out.println("Decreasing balance of Mr. Grzeczny: " + account1.balanceDecrease(589.23));

        Bank.closeAccount("Wolna");
    }
}
