package pl.com.ttpsc.kursJava.Bank;

import java.util.List;

public interface IBank {

    /**
     * method addCustomer adds Customer to the customerList
     */
    void addCustomer (Customer customer);

    /**
     * method searchingCustomer searches for Customer by the given surname, in the customerList
     */
    void searchingCustomer (String surname);

    /**
     * method searchingCustomer searches for Customer by the given name and surname, in the customerList
     */
    void searchingCustomer (String name, String surname);

    /**
     * method removingCustomer searches for Customer by the given surname and removes it from the customerList
     */
    void removingCustomer (String surname);

    /**
     * method displayList displays the whole customerList which contains the Customers and the accountLists
     */
    void displayList ();
}
