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

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public String getIDnumber () {
        return IDnumber;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void displayAccountList() {
        for (Account acc: accountList) {
            System.out.println("Account list for " + surname+": "+ acc);
        }
    }

    public void customerBalanceConvertion (){
        for (Account acc : accountList){
            System.out.println("Balance conversion of account list: " + acc.balanceConvertion());
        }
    }
}