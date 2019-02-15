package pl.com.ttpsc.kursJava.Bank;

public abstract class Account {

    double balanceAccount;

     void isActive (){
        if ( this.balanceAccount> 0){
            System.out.println("Active account");
        }
        else {
            System.out.println("Inactive account");
        }
    }

    public void balanceConvertion (){}

}
