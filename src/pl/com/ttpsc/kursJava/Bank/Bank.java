package pl.com.ttpsc.kursJava.Bank;

import java.util.LinkedList;
import java.util.List;

public class Bank implements IBank{

   private static List <Customer> customerList;

    Bank (){
        this.customerList = new LinkedList<>();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
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

    public static void main(String[] args) {

        CurrentAccount acc1 = new CurrentAccount(1000.00);
        CurrentAccount acc2 = new CurrentAccount(5698.01);
        CurrentAccount acc3 = new CurrentAccount(228.30);
        CurrentAccount acc4 = new CurrentAccount(100200.00);
        CurrentAccount acc5 = new CurrentAccount(00.00);
        SavingAccount sav1 = new SavingAccount(5000.00);
        SavingAccount sav2 = new SavingAccount(1000.00);
        SavingAccount sav3 = new SavingAccount(789.25);

        IndividualCustomer customer1 = new IndividualCustomer("Tomasz", "Wolny", "70100205789");
        IndividualCustomer customer2 = new IndividualCustomer("Piotr", "Słowik", "56021589125");
        IndividualCustomer customer3 = new IndividualCustomer("Irena", "Raj", "82041082742");
        IndividualCustomer customer4 = new IndividualCustomer("Anna", "Zając", "68092705148");
        IndividualCustomer customer5 = new IndividualCustomer("Tomasz", "King", "79053012451");

        customer1.addAccount(acc1 );
        customer2.addAccount(acc2 );
        customer3.addAccount(acc3 );
        customer4.addAccount(acc4 );
        customer5.addAccount(acc5 );
        customer1.addAccount(sav1 );
        customer2.addAccount(sav2 );
        customer3.addAccount(sav3 );

        Bank testBank = new Bank();

        testBank.addCustomer(customer1);
        testBank.addCustomer(customer2);
        testBank.addCustomer(customer3);
        testBank.addCustomer(customer4);
        testBank.addCustomer(customer5);

        acc5.isActive();
        sav2.isActive();

      testBank.searchingCustomer( "Raj");
      testBank.searchingCustomer( "Piotr", "Słowik");
      testBank.removingCustomer("King");
      testBank.displayList();

        customer1.displayAccountList();

      sav2.balanceConvertion();

    }
}
