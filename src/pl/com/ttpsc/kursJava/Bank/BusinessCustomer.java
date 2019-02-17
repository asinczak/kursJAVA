package pl.com.ttpsc.kursJava.Bank;

public class BusinessCustomer extends Customer{

    String TIN;
    SavingAccount sav;
    double balance;

    BusinessCustomer(String name, String surname, String IDnumber, String TIN, double balance) {
        super(name, surname, IDnumber);
        this.TIN = TIN;
        this.balance = balance;

        this.sav = null;
        try {
            sav = new SavingAccount(this.balance) ;

        } catch (BalanceExeption balanceExeption) {
            System.out.println(balanceExeption.getMessage());
        }
    }

    public String getTIN () {
        return TIN;
    }

    public double getbalance () {
        return balance;
    }

    public String toString () {
        return "" + getName()+" "+ getSurname() +" "+ getIDnumber() +" "+ getTIN() +" "+ getbalance();
    }
}
