package pl.com.ttpsc.kursJava.wyklad_6;

public class Dollar extends Money {

    public Dollar (double amountOfMoney) {
        super(amountOfMoney);
    }

    public void add (Dollar dollar) {
        amountOfMoney = dollar.amountOfMoney + this.amountOfMoney;
    }


    public Dollar addWithExchange (Franc franc, double dollarExchngeRate) {
        this.amountOfMoney = franc.amountOfMoney * dollarExchngeRate + this.amountOfMoney;
        return new Dollar(this.amountOfMoney);
    }
}
