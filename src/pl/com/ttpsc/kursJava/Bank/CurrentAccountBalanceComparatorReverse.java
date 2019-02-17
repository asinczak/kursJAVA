package pl.com.ttpsc.kursJava.Bank;

import java.util.Comparator;

public class CurrentAccountBalanceComparatorReverse implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return (int) (o2.accountList.get(0).getBalanceAccount()-o1.accountList.get(0).getBalanceAccount());
    }
}
