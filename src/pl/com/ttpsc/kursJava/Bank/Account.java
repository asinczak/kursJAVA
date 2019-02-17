package pl.com.ttpsc.kursJava.Bank;

public class Account {

    double balanceAccount;

    public Account (double balanceAccount) throws BalanceExeption {
        this.balanceAccount = balanceAccount;
            if (balanceAccount <= 0) {
                throw new BalanceExeption();
            }
    }

     void isActive (){
        if ( this.balanceAccount> 0){
            System.out.println("Active account");
        }
        else {
            System.out.println("Inactive account");
        }
    }

    public double balanceConvertion (){
         return this.balanceAccount;
    }

}
