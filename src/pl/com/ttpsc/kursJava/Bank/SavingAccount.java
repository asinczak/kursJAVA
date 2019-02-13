package pl.com.ttpsc.kursJava.Bank;

public class SavingAccount implements Account {

   double balanceSavingAccount;

   SavingAccount (double balanceSavingAccount) {
       this.balanceSavingAccount = balanceSavingAccount;
   }

    public double getBalanceSavingAccount () {
        return balanceSavingAccount;
    }

    @Override
    public void isActive() {
        if (this.balanceSavingAccount > 0){
            System.out.println("Active account");
        }
        else {
            System.out.println("Inactive account");
        }
    }

    public void increasingBalance (double balanceSavingAccount) {
        this.balanceSavingAccount = balanceSavingAccount + (balanceSavingAccount * 0.02);
    }

    public String toString (){
       return "Sav balance: " + getBalanceSavingAccount();
    }
}
