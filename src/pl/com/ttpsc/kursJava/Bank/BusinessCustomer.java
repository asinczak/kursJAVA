package pl.com.ttpsc.kursJava.Bank;

import java.util.LinkedList;

public class BusinessCustomer extends Customer{

    String TIN;

    BusinessCustomer(String name, String surname, String IDnumber, String TIN, double balance) {
        super(name, surname, IDnumber);
        this.TIN = TIN;
        this.accountList = new LinkedList<>();

        try {
           accountList.add(IBank.createSavingAccount(balance));

        } catch (BalanceExeption balanceExeption) {
            System.out.println(balanceExeption.getMessage());
        }
    }

    public String getTIN () {
        return TIN;
    }


    public String toString () {
        return "" + getName()+" "+ getSurname() +" "+ getIDnumber() +" "+ getTIN();
    }
}
