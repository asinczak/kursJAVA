package pl.com.ttpsc.kursJava.Bank;

public class TransferException extends Exception {

    public String getMessage () {
        return "Insufficient funds. You cannot make the transfer";
    }
}
