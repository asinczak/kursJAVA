package pl.com.ttpsc.kursJava.wyklad_6;

public class Franc extends Money {

    public Franc (double amountOfMoney) {
        super(amountOfMoney);
    }

    public void add (Franc franc) {
        this.amountOfMoney = franc.amountOfMoney + this.amountOfMoney;
    }

    public Franc addWithExchange (Dollar dollar, double francExchangeRate) {
        this.amountOfMoney = dollar.amountOfMoney * francExchangeRate + this.amountOfMoney;
        return new Franc(this.amountOfMoney);
    }

    @Override
    public String toString () {
        return "" + getAmountOfMoney();
    }
}
