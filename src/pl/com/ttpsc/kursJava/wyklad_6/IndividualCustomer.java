package pl.com.ttpsc.kursJava.wyklad_6;

import java.util.LinkedList;
import java.util.List;

public class IndividualCustomer extends Customer{

    double balanceCurrentAccount;
    double balanceSavingAccount;
    List <CurrentAccount> currentAccountList;
    CurrentAccount currentAccount;

    IndividualCustomer (String name, String surname, String IDnumber, CurrentAccount currentAccount, List <CurrentAccount> currentAccountList) {
        super(name, surname, IDnumber);
        this.currentAccount = currentAccount;
        this.currentAccountList = currentAccountList;
        this.balanceCurrentAccount = currentAccount.balanceCurrentAccount;
    }

    public void addSavingAccount(IndividualCustomer customer, SavingAccount savingAccount) {
        this.balanceSavingAccount = savingAccount.balanceSavingAccount;
    }

    public CurrentAccount getCurrentAccount (){
        return currentAccount;
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

     public double getBalanceCurrentAccount () {
        return balanceCurrentAccount;
     }

     public double getBalanceSavingAccount () {
        return balanceSavingAccount;
     }

    public String toString () {
        return "" + getName()+" "+ getSurname() +" "+ getIDnumber() +" "+ getBalanceCurrentAccount();
    }



}