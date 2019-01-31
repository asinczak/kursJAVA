package pl.com.ttpsc.kursJava.wyklad_6;

public class Account {

    double balanceAccount;
    double balanceSavingAccount;
    String name;
    String surname;
    String name_surname;


    public Account (String name, String surname, double balanceAccount) {
        this.name = name;
        this.surname = surname;
        this.balanceAccount = balanceAccount;
        if (balanceAccount < 0){
            System.out.println("You can't create account with negative balance");
        }
    }

    public Account (String name_surname, double balanceSavingAccount) {
        this.name_surname = name_surname;
        this.balanceSavingAccount = balanceSavingAccount;
    }


    public double balanceIncrease (double amount) {
        return balanceAccount += amount;
    }

    public double balanceDecrease (double amount) {
        return balanceAccount -= amount;
    }

    public double savingBalanceIncrease () {
        return balanceSavingAccount = balanceSavingAccount + (balanceSavingAccount*0.02);
    }
}
