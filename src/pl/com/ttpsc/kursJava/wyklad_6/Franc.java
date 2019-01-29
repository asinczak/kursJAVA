package pl.com.ttpsc.kursJava.wyklad_6;

public class Franc extends Money {

    public Franc (double amountOfMoney) {
        super(amountOfMoney);
    }

    public void add (Franc franc) {
        this.amountOfMoney = franc.amountOfMoney + this.amountOfMoney;
    }

    public Franc addWithExchange (Dollar dollar) {
        this.amountOfMoney = dollar.amountOfMoney * 0.99 + this.amountOfMoney;
        return new Franc(this.amountOfMoney);
    }
}
