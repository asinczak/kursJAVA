package pl.com.ttpsc.kursJava.Bank;

import java.util.LinkedList;

public class IndividualCustomer extends Customer{

    IndividualCustomer (String name, String surname, String IDnumber) {
        super(name, surname, IDnumber);
        this.accountList = new LinkedList<>();
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

     public String toString () {
        return "" + getName()+" "+ getSurname() +" "+ getIDnumber();
    }
}