package pl.com.ttpsc.kursJava.Bank;

public class BalanceExeption extends Exception {

    public String getMessage () {
        return "You cannot create account with negative balance";
    }
}
