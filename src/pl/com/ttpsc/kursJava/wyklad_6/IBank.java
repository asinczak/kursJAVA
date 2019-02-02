package pl.com.ttpsc.kursJava.wyklad_6;

import java.util.List;

public interface IBank {

    void searchingCustomer1 (List <IndividualCustomer> list, String surname);

    void searchingCustomer2 (List <IndividualCustomer> list, String name, String surnmae);

    void removingCustomer (List <IndividualCustomer> list, String surname);

    void displayList (List <IndividualCustomer> list);
}
