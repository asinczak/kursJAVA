package pl.com.ttpsc.kursJava.wyklad_6;

public class Exchange {

    double dollarExchangeRate;
    double francExchangeRate;

    public Exchange(double dollarExchangeRate, double francExchangeRate) {
        this.dollarExchangeRate = dollarExchangeRate;
        this.francExchangeRate = francExchangeRate;
    }

    public double dollarToFrancRatio() {
        return dollarExchangeRate;
    }

    public double francToDollarRatio() {
        return francExchangeRate;
    }

    public Franc dollarToFranc(Dollar dollar) {

        return new Franc(dollar.amountOfMoney * dollarExchangeRate);
    }

    public Dollar francToDollar(Franc franc) {
        return new Dollar(franc.amountOfMoney * francExchangeRate);
    }


    public static void main(String[] args) {

        Exchange exchange = new Exchange(0.99, 1.01);
        System.out.println("Przelicznik USD/CHF: " + exchange.dollarToFrancRatio());
        System.out.println("Przelicznik CHF/USD: " + exchange.francToDollarRatio());

        Dollar dollar2 = new Dollar(115);
        Franc franc2 = exchange.dollarToFranc(dollar2);
        System.out.println("Frank po zamianie: " + franc2.getAmountOfMoney());
        Dollar dollar3 = exchange.francToDollar(franc2);
        System.out.println("Dolar po zamianie: " + dollar3.getAmountOfMoney());

    }

}