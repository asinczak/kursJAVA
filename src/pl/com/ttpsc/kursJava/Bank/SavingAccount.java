package pl.com.ttpsc.kursJava.Bank;

public class SavingAccount extends Account {

    public SavingAccount(double balanceAccount) throws BalanceExeption {
        super(balanceAccount);
    }

    public double getBalanceSavingAccount () {
        return balanceAccount;
    }

    public double increasingBalance () {
        return this.balanceAccount = balanceAccount + (balanceAccount * 0.02);
    }

    public String toString (){
       return "Sav balance: " + getBalanceSavingAccount();
    }

    public double balanceConvertion (){
                this.balanceAccount = balanceAccount + (balanceAccount * 0.02);
        return this.balanceAccount;
    }
}
