package pl.com.ttpsc.kursJava.Bank;

import java.util.List;

public interface IBank {

    void addCustomer (Customer customer);

    void searchingCustomer1 (List <Customer> list, String surname);

    void searchingCustomer2 (List <Customer> list, String name, String surnmae);

    void removingCustomer (List <Customer> list, String surname);

    void displayList (List <Customer> list);
}
