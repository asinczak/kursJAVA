package pl.com.ttpsc.kursJava.Bank;

import java.util.LinkedList;
import java.util.List;

public class IndividualCustomer extends Customer{

    double balanceCurrentAccount;
    double balanceSavingAccount;
    List <Account> accountList;

    IndividualCustomer (String name, String surname, String IDnumber) {
        super(name, surname, IDnumber);
        this.accountList = new LinkedList<>();
    }

    public void addAccount(Account account, IndividualCustomer customer) {
        customer.accountList.add(account);
    }

    public String getName () {
        return name;
    }

     public String getSurname () {
        return surname;
     }

     public String getIDnumber () {
        return IDnumber;
     }

    public void displayAccountList(IndividualCustomer customer) {
        for (Object obj: customer.accountList) {
            System.out.println("Account list for " + customer.surname+": "+ obj);
        }
    }

    public String toString () {
        return "" + getName()+" "+ getSurname() +" "+ getIDnumber();
    }
}