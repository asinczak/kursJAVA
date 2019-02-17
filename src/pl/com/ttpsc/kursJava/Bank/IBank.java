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

    /**
     * method bankAccountConversion displays accounts conversion of all customers
     */
    public void bankAccountConversion ();

    /**
     *method createCurrentAccount opens current account
     */
    public Account createCurrentAccount (double balance);

    /**
     *method createSavingAccount opens saving account
     */
    public Account createSavingAccount (double balance);

    /**
     * method searchingByIDnumber finds customer by the given ID number
     */
    public void searchingByIDnumber (String IDnumber);

    /**
     * method sortingListAlphabetically sorts customers list alphabetically
     */
    public void sortingListAlphabetically ();

    /**
     * method sortingListByBalance sorts customers list crescively by the current Account balance
     */
    public void sortingListByBalance ();

    /**
     * method sortingListByBalanceReverse sorts customers list in descending order by the current Account balance
     */
    public void sortingListByBalanceReverse ();

    /**
     * method makeTransfer transfers money from one to another account
     */
    public void makeTransfer (double amount, String surname1, String surname2, int place);
}

