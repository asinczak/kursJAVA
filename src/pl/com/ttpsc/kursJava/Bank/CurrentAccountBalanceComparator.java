package pl.com.ttpsc.kursJava.Bank;

import java.util.Comparator;

public class CurrentAccountBalanceComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return (int) (c1.accountList.get(0).getBalanceAccount()-c2.accountList.get(0).getBalanceAccount());
    }

}
