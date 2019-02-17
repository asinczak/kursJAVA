package pl.com.ttpsc.kursJava.Bank;

import java.util.*;

import static java.util.Collections.*;

public class Bank implements IBank{

   private static List <Customer> customerList;

    Bank (){
        this.customerList = new LinkedList<>();
    }

    @Override
    public void addCustomer(Customer customer) {
        do {
            try {
                for (Customer cust : customerList) {
                    if (cust.IDnumber.equals(customer.IDnumber)) {
                        throw new TheSameCustomerException();
                    }
                }
                } catch(TheSameCustomerException e) {
                System.out.println(e.getMessage());
            }
                customerList.add(customer);
                    break;
            } while (true) ;
    }

    @Override
    public void searchingCustomer(String surname) {
        for(int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).surname.equals(surname)){
                System.out.println("Searching for the surname: " + customerList.get(i).IDnumber);
            }
        }
    }

    @Override
    public void searchingCustomer(String name, String surname) {
        for(int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).name.equals(name) & customerList.get(i).surname.equals(surname)) {
                System.out.println("Searching for the name & surname: " + customerList.get(i).IDnumber);
            }
        }
    }

    @Override
    public void removingCustomer(String surname) {
        for(int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).surname.equals(surname)) {
                System.out.println("Removing customer: " + customerList.remove(i));
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

    public Account createCurrentAccount (double balance) {
        Account acc = null;
        try {
               acc = new CurrentAccount(balance);

            } catch (BalanceExeption balanceExeption) {
                System.out.println(balanceExeption.getMessage());
            }
        return acc;
    }

    public Account createSavingAccount (double balance){
        Account sav = null;
        try {
             sav = new SavingAccount(balance) ;

        } catch (BalanceExeption balanceExeption) {
            System.out.println(balanceExeption.getMessage());
        }
        return sav;
    }

    public void searchingByIDnumber (String IDnumber) {
        Map <String, Customer> customerMap = new LinkedHashMap<>();
            for (Customer cm : customerList) {
                customerMap.put(cm.IDnumber, cm);
            }

            Set<Map.Entry< String, Customer>> entrySet = customerMap.entrySet();
            for (Map.Entry<String, Customer> entry : entrySet) {
                if (IDnumber.equals(entry.getKey())){
                    System.out.println("Searched customer is: "+ entry.getValue());
                }
            }
    }

    public void sortingListAlphabetically () {
        System.out.println("Customer list sorted alphabetically: ");
        Collections.sort(customerList, new CustomerSurnameComparator());
        for (Customer cm : customerList){
            System.out.println(cm);
        }
    }

    public void sortingListByBalance () {
        System.out.println("customers list sorted crescively by the current Account balance: ");
        Collections.sort(customerList, new CurrentAccountBalanceComparator());
        for (Customer cm : customerList) {
            System.out.println(cm);
        }
    }

    public void sortingListByBalanceReverse () {
        System.out.println("Customers list sorted in descending order by the current Account balance: ");
        Collections.sort(customerList, new CurrentAccountBalanceComparatorReverse());
        for (Customer cm : customerList) {
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
