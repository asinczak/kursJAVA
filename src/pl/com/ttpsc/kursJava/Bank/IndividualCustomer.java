package pl.com.ttpsc.kursJava.Bank;

import java.util.LinkedList;
import java.util.List;

public class IndividualCustomer extends Customer{

    IndividualCustomer (String name, String surname, String IDnumber) {
        super(name, surname, IDnumber);
        this.accountList = new LinkedList<>();
    }




}