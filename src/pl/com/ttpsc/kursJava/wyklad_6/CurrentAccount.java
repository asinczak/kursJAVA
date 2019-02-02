package pl.com.ttpsc.kursJava.wyklad_6;

public class CurrentAccount implements Account {

    double balanceCurrentAccount;

    CurrentAccount (double balanceCurrentAccount) {
       this.balanceCurrentAccount = balanceCurrentAccount;
   }

    public CurrentAccount () {
        this.balanceCurrentAccount = balanceCurrentAccount;
        if (balanceCurrentAccount < 0){
            System.out.println("You can't create account with negative balance");
        }
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
        if (this.balanceCurrentAccount == 0){
            System.out.println("Inactive account");
        }

    }
}
