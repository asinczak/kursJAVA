package pl.com.ttpsc.kursJava.Bank;

import java.util.Collections;
import java.util.Scanner;

public class TestBank {

    public enum Accounts {
        CURRENT_ACCOUNT, SAVING_ACCOUNT
    }

    public static Account createAccountFromConsole(String account) throws BalanceExeption{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance account :");
        double balance = scanner.nextDouble();

                if (Accounts.CURRENT_ACCOUNT.equals(account)) {
                    return IBank.createCurrentAccount(balance);

                } else {
                    return IBank.createSavingAccount(balance);
                }
    }

    /**
     * Method addingAcc adds account to the customer list
     * @param customer points which customer will have the account added
     * @param account is a kind of an account, you MUST choose between these two:
     *                1. CURRENT_ACCOUNT (you assign and create current account)
     *                2. SAVING_ACCOUNT (you assign and create saving account)
     */

    public static void addingAcc (Customer customer, String account) {
        do {
            try {

                if (Accounts.CURRENT_ACCOUNT.equals(account)) {
                    customer.addAccount(createAccountFromConsole(account));
                } else {
                    customer.addAccount(createAccountFromConsole(account));
                }
            } catch (BalanceExeption e) {
                System.out.println(e.getMessage());
            }break;
        } while (true);
    }

    public static void main(String[] args) {

        Bank testBank = new Bank();

        Customer customer1 = new IndividualCustomer("Tomasz", "Wolny", "70100205789");
        Customer customer2 = new IndividualCustomer("Piotr", "Słowik", "56021589125");
        Customer customer3 = new IndividualCustomer("Irena", "Raj", "82041082742");
        Customer customer4 = new IndividualCustomer("Anna", "Zając", "68092705148");
        Customer customer5 = new IndividualCustomer("Tomasz", "King", "79053012451");

        Customer customer6 = new BusinessCustomer("Zuzanna", "Szybka", "77020515963", "125874365", 2000.00);


        TestBank.addingAcc(customer1, "CURRENT_ACCOUNT");
        TestBank.addingAcc(customer1, "SAVING_ACCOUNT");
        TestBank.addingAcc(customer2, "CURRENT_ACCOUNT");
        TestBank.addingAcc(customer2, "SAVING_ACCOUNT");
        TestBank.addingAcc(customer3, "CURRENT_ACCOUNT");
        TestBank.addingAcc(customer3, "SAVING_ACCOUNT");
        TestBank.addingAcc(customer4, "CURRENT_ACCOUNT");
        TestBank.addingAcc(customer5, "CURRENT_ACCOUNT");


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
