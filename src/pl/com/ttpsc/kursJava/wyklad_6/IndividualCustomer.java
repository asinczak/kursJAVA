package pl.com.ttpsc.kursJava.wyklad_6;

import java.util.LinkedList;
import java.util.List;

public class IndividualCustomer extends Customer{

    double balanceCurrentAccount;
    double balanceSavingAccount;

    IndividualCustomer (String name, String surname, String IDnumber, CurrentAccount currentAccount) {
        super(name, surname, IDnumber);
        this.balanceCurrentAccount = currentAccount.balanceCurrentAccount;
    }

    public void addSavingAccount(IndividualCustomer customer, SavingAccount savingAccount) {
        this.balanceSavingAccount = savingAccount.balanceSavingAccount;
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


    public static void main(String[] args) {


        List<CurrentAccount> accountList = new LinkedList<>();

        CurrentAccount acc1 = new CurrentAccount(1000.00);
        CurrentAccount acc2 = new CurrentAccount(5698.01);
        CurrentAccount acc3 = new CurrentAccount(228.30);
        CurrentAccount acc4 = new CurrentAccount(100200.00);
        CurrentAccount acc5 = new CurrentAccount(78253.46);

        accountList.add(acc1);
        accountList.add(acc2);
        accountList.add(acc3);
        accountList.add(acc4);
        accountList.add(acc5);



    }

}