package pl.com.ttpsc.kursJava.Bank;

public class Account {

    double balanceAccount;

    public Account (double balanceAccount) throws BalanceExeption {
        this.balanceAccount = balanceAccount;
            if (balanceAccount < 0) {
                throw new BalanceExeption();
            }
    }

    public double getBalanceAccount () {
        return balanceAccount;
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

    public void increasingBalanace (double amount) {
        balanceAccount = balanceAccount + amount;
    }

    public void decreasingBalance (double amount) {
        balanceAccount = balanceAccount - amount;
    }

}
