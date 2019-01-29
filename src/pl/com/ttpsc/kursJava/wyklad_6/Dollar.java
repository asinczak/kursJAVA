package pl.com.ttpsc.kursJava.wyklad_6;

public class Dollar extends Money {

    public Dollar (double amountOfMoney) {
        super(amountOfMoney);
    }

    public void add (Dollar dollar) {
        amountOfMoney = dollar.amountOfMoney + this.amountOfMoney;
    }


    public Dollar addWithExchange (Franc franc) {
        this.amountOfMoney = franc.amountOfMoney * 1.01 + this.amountOfMoney;
        return new Dollar(this.amountOfMoney);
    }
}
