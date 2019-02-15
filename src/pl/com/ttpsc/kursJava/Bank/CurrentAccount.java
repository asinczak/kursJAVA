package pl.com.ttpsc.kursJava.Bank;

public class CurrentAccount extends Account {

    CurrentAccount (double balanceCurrentAccount) {
        this.balanceAccount = balanceCurrentAccount;
        if (balanceCurrentAccount < 0){
            System.out.println("You can't create account with negative balance");
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
