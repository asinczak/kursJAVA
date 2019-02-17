package pl.com.ttpsc.kursJava.Bank;

import java.util.Collections;

public class TestBank {

    public static void main(String[] args) {

        Bank testBank = new Bank();

        Customer customer1 = new IndividualCustomer("Tomasz", "Wolny", "70100205789");
        Customer customer2 = new IndividualCustomer("Piotr", "Słowik", "56021589125");
        Customer customer3 = new IndividualCustomer("Irena", "Raj", "82041082742");
        Customer customer4 = new IndividualCustomer("Anna", "Zając", "68092705148");
        Customer customer5 = new IndividualCustomer("Tomasz", "King", "79053012451");

        Customer customer6 = new BusinessCustomer("Zuzanna", "Szybka", "77020515963", "125874365", 2000.00);

        customer1.addAccount(testBank.createCurrentAccount(5602.05) );
        customer2.addAccount(testBank.createCurrentAccount(10589.00) );
        customer3.addAccount(testBank.createCurrentAccount(1000.99) );
        customer4.addAccount(testBank.createCurrentAccount(5896.89) );
        customer5.addAccount(testBank.createCurrentAccount(58.00) );
        customer1.addAccount(testBank.createSavingAccount(5000.00) );
        customer2.addAccount(testBank.createSavingAccount(10000.00) );
        customer3.addAccount(testBank.createSavingAccount(150000) );

        testBank.addCustomer(customer1);
        testBank.addCustomer(customer2);
        testBank.addCustomer(customer3);
        testBank.addCustomer(customer4);
        testBank.addCustomer(customer5);

        customer1.getAccount(1).isActive();
        customer5.getAccount(0).isActive();

        testBank.searchingCustomer( "Raj");
        testBank.searchingCustomer( "Piotr", "Słowik");
        testBank.removingCustomer("King");
        testBank.displayList();

        customer1.displayAccountList();

        customer2.getAccount(1).balanceConvertion();

        System.out.println("================================");

        testBank.bankAccountConversion();
        testBank.searchingByIDnumber("70100205789");
        testBank.sortingListAlphabetically();
        testBank.sortingListByBalance();
        testBank.sortingListByBalanceReverse();
        System.out.println("================================");
        System.out.println("Customer list after adding business Customer: ");
        testBank.addCustomer(customer6);
        testBank.displayList();
        testBank.makeTransfer(1000, "Raj", "Zając", 0);
        System.out.println("Balances after transfers: " +customer3.getAccount(0).getBalanceAccount()+" "+ customer4.getAccount(0).getBalanceAccount());
    }

}
