package pl.com.ttpsc.kursJava.XMLfileExercise;

public class Currency {

    String currencyName;
    String currencyCode;
    String averageCurrency;

    public Currency (String currencyName, String currencyCode, String averageCurrency) {
        this.currencyName = currencyName;
        this.currencyCode = currencyName;
        this.averageCurrency = averageCurrency;
    }

    public String getCurrencyName (){
        return currencyName;
    }

    public String getCurrencyCode (){
        return currencyCode;
    }

    public String getAverageCurrency (){
        return averageCurrency;
    }

    @Override
    public String toString() {
        return "" + getCurrencyName() +" "+ getCurrencyCode() +" "+ getAverageCurrency();
    }
}
