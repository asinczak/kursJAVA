package pl.com.ttpsc.kursJava.XMLfileExercise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "pozycja")
@XmlAccessorType(XmlAccessType.NONE)
public class Currency  {

    String currencyName;
    String conversion;
    String currencyCode;
    String averageRate;

    public String getCurrencyName() {
        return currencyName;
    }

    @XmlElement (name = "nazwa_waluty")
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getConversion() {
        return conversion;
    }

    @XmlElement (name = "przelicznik")
    public void setConversion(String conversion) {
        this.conversion = conversion;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement (name = "kod_waluty")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAverageRate() {
        return averageRate;
    }

    @XmlElement (name = "kurs_sredni")
    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    public String toString() {

        return "" + getCurrencyName()+" "+getConversion()+" "+getCurrencyCode()+" "+getAverageRate();
    }
}
