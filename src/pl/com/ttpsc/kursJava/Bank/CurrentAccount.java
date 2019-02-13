package pl.com.ttpsc.kursJava.Bank;

public class CurrentAccount implements Account {

    double balanceCurrentAccount;

    CurrentAccount (double balanceCurrentAccount) {
        this.balanceCurrentAccount = balanceCurrentAccount;
        if (balanceCurrentAccount < 0){
            System.out.println("You can't create account with negative balance");
        }
   }

    public double getBalanceCurrentAccount () {
        return balanceCurrentAccount;
    }

    public double balanceIncrease (double amount) {
        return balanceCurrentAccount += amount;
    }

    public double balanceDecrease (double amount) {
        return balanceCurrentAccount -= amount;
    }


    @Override
    public void isActive() {
        if (this.balanceCurrentAccount > 0){
            System.out.println("Active account");
        }
        else {
            System.out.println("Inactive account");
        }
    }

    public String toString () {
        return  "Acc balance :" + getBalanceCurrentAccount();
    }
}
