package pl.com.ttpsc.kursJava.Bank;

public class TheSameCustomerException extends Exception {

    public String getMessage (){
       return "This customer has been already added to the bank";
    }
}
