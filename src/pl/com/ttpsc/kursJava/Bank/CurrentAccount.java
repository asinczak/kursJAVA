package pl.com.ttpsc.kursJava.Bank;

public class CurrentAccount extends Account {

    CurrentAccount (double balanceCurrentAccount) {
        this.balanceAccount = balanceCurrentAccount;
        try {
            if (balanceCurrentAccount <= 0) {
                throw new BalanceExeption();
            }
        } catch (BalanceExeption b) {
            System.out.println(b.getMessage());
        }
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
