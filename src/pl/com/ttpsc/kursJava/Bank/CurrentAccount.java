package pl.com.ttpsc.kursJava.Bank;

public class CurrentAccount extends Account {


    public CurrentAccount(double balanceAccount) throws BalanceExeption {
        super(balanceAccount);
    }

    public double getBalanceCurrentAccount () {
        return balanceAccount;
    }

    public double balanceIncrease (double amount) {
        return balanceAccount += amount;
    }

    public double balanceDecrease (double amount) {
        return balanceAccount -= amount;
    }

    public String toString () {
        return  "Acc balance :" + getBalanceCurrentAccount();
    }

}
