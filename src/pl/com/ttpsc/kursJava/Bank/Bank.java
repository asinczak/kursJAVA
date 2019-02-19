package pl.com.ttpsc.kursJava.Bank;

import java.util.*;

import static java.util.Collections.*;

public class Bank implements IBank{

   private static Set <Customer> customerList;
    Map <String, Customer> customerMap;

    Bank (){
        this.customerList = new LinkedHashSet<>();
        this.customerMap = new LinkedHashMap<>();
    }

    @Override
    public void addCustomer(Customer customer) {

        boolean adding = customerList.add(customer);
       try {
           if (!adding) {
               throw new TheSameCustomerException();
           }
       }catch (TheSameCustomerException e){
           System.out.println(e.getMessage());
       }
        customerMap.put(customer.IDnumber, customer);

    }

    @Override
    public void searchingCustomer(String surname) {
        for (Customer cm : customerList) {
            if (cm.surname.equals(surname)){
              System.out.println("Searching for the surname: " + cm.IDnumber);
            }
        }
    }

    @Override
    public void searchingCustomer(String name, String surname) {
        for(Customer cm : customerList){
            if (cm.name.equals(name) & cm.surname.equals(surname)){
                System.out.println("Searching for the name & surname: " + cm.IDnumber);
            }
        }
    }

    @Override
    public void removingCustomer(String surname) {
        Iterator <Customer> it = customerList.iterator();
        while (it.hasNext()){
            Customer cm = it.next();
            if (cm.surname.equals(surname)){
                it.remove();
                System.out.println("Removing customer: " + cm);
            }
        }
    }

    @Override
    public void displayList() {
        for (Customer customer: customerList) {
            System.out.println("Customer: " + customer);
            System.out.println("Account list" + customer.accountList);
        }
    }

    public void bankAccountConversion (){
        for (Customer customer : customerList){
           customer.customerBalanceConvertion();
        }
    }

    public Account createCurrentAccount (double balance) throws BalanceExeption {
        return new CurrentAccount(balance);
    }

    public Account createSavingAccount (double balance) throws BalanceExeption {
        return new SavingAccount(balance);
    }

    public void searchingByIDnumber (String IDnumber) {
        Customer cm = customerMap.get(IDnumber);
        System.out.println("Searched customer is: "+ cm);
    }

    public void sortingListAlphabetically () {
        System.out.println("Customer list sorted alphabetically: ");
        List <Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new CustomerSurnameComparator());
        for (Customer cm : list){
            System.out.println(cm);
        }
    }

    public void sortingListByBalance () {
        System.out.println("customers list sorted crescively by the current Account balance: ");
        List <Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new CurrentAccountBalanceComparator());
        for (Customer cm : list) {
            System.out.println(cm);
        }
    }

    public void sortingListByBalanceReverse () {
        System.out.println("Customers list sorted in descending order by the current Account balance: ");
        List <Customer> list = new ArrayList<>(customerList);
        Collections.sort(list, new CurrentAccountBalanceComparatorReverse());
        for (Customer cm : list) {
            System.out.println(cm);
        }
    }

    public void makeTransfer (double amount, String surname1, String surname2, int place) {
            for (Customer cm : customerList) {
                if(cm.surname.equals(surname1)) {
                if (cm.accountList.get(place).getBalanceAccount() < amount) {
                    try {
                        throw new TransferException();

                    } catch (TransferException e) {
                        System.out.println(e.getMessage());
                    }

                } else {
                    for (Customer cm1 : customerList) {
                        if (cm1.surname.equals(surname1)) {
                            cm1.accountList.get(place).decreasingBalance(amount);
                        }
                        if (cm1.surname.equals(surname2)) {
                            cm1.accountList.get(place).increasingBalanace(amount);
                        }
                    }
                    }
                }
            }
    }

}
