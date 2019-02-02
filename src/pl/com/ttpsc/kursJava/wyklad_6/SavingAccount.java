package pl.com.ttpsc.kursJava.wyklad_6;

public class SavingAccount implements Account {

   double balanceSavingAccount;

   SavingAccount (double balanceSavingAccount) {
       this.balanceSavingAccount = balanceSavingAccount;
   }

    @Override
    public void isActive() {
        if (this.balanceSavingAccount > 0){
            System.out.println("Active account");
        }
        if (this.balanceSavingAccount == 0){
            System.out.println("Inactive account");
        }
    }

    public void increasingBalance (double balanceSavingAccount) {
        this.balanceSavingAccount = balanceSavingAccount + (balanceSavingAccount * 0.02);
    }
}
