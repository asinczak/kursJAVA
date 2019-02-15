package pl.com.ttpsc.kursJava.Bank;

import java.util.List;

public class Customer {

     String name;
     String surname;
     String IDnumber;

    List<Account> accountList;

    Customer(String name, String surname, String IDnumber) {
        this.name = name;
        this.surname = surname;
        this.IDnumber = IDnumber;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void displayAccountList() {
        for (Object obj: accountList) {
            System.out.println("Account list for " + surname+": "+ obj);
        }
    }
}