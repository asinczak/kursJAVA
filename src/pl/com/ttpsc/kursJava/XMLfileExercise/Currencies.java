package pl.com.ttpsc.kursJava.XMLfileExercise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "tabela_kursow")
@XmlAccessorType (XmlAccessType.NONE)
public class Currencies {

    @XmlElement (name = "pozycja")
    List <Currency> currencyList = new ArrayList<>();

    String tableNumber;
    String publicDate;

    @XmlElement (name = "numer_tabeli")
    public void setTableNumber (String tableNumber) {
        this.tableNumber = tableNumber;
    }

    @XmlElement (name = "data_publikacji")
    public void setPublicDate (String publicDate) {
        this.publicDate = publicDate;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public String getTableNumber() {
        return tableNumber;
    }


    public List <Currency> getCurrencyList (){
        return currencyList;
    }

    public void setCurrencyList (List<Currency> currencyList){
        this.currencyList = currencyList;
    }

}
