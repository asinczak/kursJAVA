package pl.com.ttpsc.kursJava.wyklad_6;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{

    @Override
    public void searchingCustomer1(List <IndividualCustomer> list, String surname) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).surname == surname) {
                System.out.println("Searching for the surname: " + list.get(i).IDnumber);
            }
        }
    }

    @Override
    public void searchingCustomer2(List <IndividualCustomer> list, String name, String surname) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).name == name & list.get(i).surname == surname) {
                System.out.println("Searching for the name & surname: " + list.get(i).IDnumber);
            }
        }
    }

    @Override
    public void removingCustomer(List <IndividualCustomer> list, String surname) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).surname == surname) {
                System.out.println("Removing customer: " + list.remove(i));
            }
        }
    }

    @Override
    public void displayList(List <IndividualCustomer> list) {
        for (Object obj: list) {
            System.out.println("Customer: " + obj);
        }
    }


    public static void main(String[] args) {

        CurrentAccount acc1 = new CurrentAccount(1000.00);
        CurrentAccount acc2 = new CurrentAccount(5698.01);
        CurrentAccount acc3 = new CurrentAccount(228.30);
        CurrentAccount acc4 = new CurrentAccount(100200.00);
        CurrentAccount acc5 = new CurrentAccount(00.00);
        SavingAccount sav1 = new SavingAccount(5000.00);

        List <IndividualCustomer> customerList = new ArrayList<>();

        IndividualCustomer customer1 = new IndividualCustomer("Tomasz", "Wolny", "70100205789", acc1);
        IndividualCustomer customer2 = new IndividualCustomer("Piotr", "Słowik", "56021589125", acc2);
        IndividualCustomer customer3 = new IndividualCustomer("Irena", "Raj", "82041082742", acc3);
        IndividualCustomer customer4 = new IndividualCustomer("Anna", "Zając", "68092705148", acc4);
        IndividualCustomer customer5 = new IndividualCustomer("Tomasz", "King", "79053012451", acc5);
        customer2.addSavingAccount(customer2, sav1);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);


      acc1.isActive();
      acc5.isActive();

      Bank testBank = new Bank();

      testBank.searchingCustomer1(customerList, "Raj");
      testBank.searchingCustomer2(customerList, "Piotr", "Słowik");
      testBank.displayList(customerList);
      testBank.removingCustomer(customerList, "King");
      testBank.displayList(customerList);


    }
}
