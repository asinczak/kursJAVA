package pl.com.ttpsc.kursJava.Bank;

public class SavingAccount extends Account {

    SavingAccount (double balanceSavingAccount) {
       this.balanceAccount = balanceSavingAccount;
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

    public void balanceConvertion (){
                this.balanceAccount = balanceAccount + (balanceAccount * 0.02);
        System.out.println("Saving balance re-count: " + balanceAccount);
    }
}
