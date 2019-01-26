package pl.com.ttpsc.kursJava.wyklad_6;

public class Account {

    double balanceAccount;
    String name;
    String surname;

    public Account (String name, String surname, double balanceAccount) {
        this.name = name;
        this.surname = surname;
        this.balanceAccount = balanceAccount;
        if (balanceAccount < 0){
            System.out.println("You can't create account with negative balance");
        }
    }



    public double balanceIncrease (double amount) {
        return balanceAccount += amount;
    }

    public double balanceDecrease (double amount) {
        return balanceAccount -= amount;
    }
}
