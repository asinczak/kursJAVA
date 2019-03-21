package pl.com.ttpsc.kursJava.XMLfileExercise;

import java.util.ArrayList;
import java.util.List;

public class CurrencyLists {

   private static final CurrencyLists currencyList = new CurrencyLists();

   private CurrencyLists() {}

    public  static CurrencyLists getInstance(){
       return currencyList;
    }

    List<String> currencyNameList = new ArrayList<>();
    List<String> currencyCodeList = new ArrayList<>();
    List<Float> averageRateListFileIn1 = new ArrayList<>();
    List<Float> averageRateListFileIn2 = new ArrayList<>();


    List<String> getCurrencyNameList() {
        return currencyNameList;
    }

    List<String> getCurrencyCodeList() {
        return currencyCodeList;
    }

    List<Float> getAverageRateListFileIn1() {
        return averageRateListFileIn1;
    }

    List<Float> getAverageRateListFileIn2() {
        return averageRateListFileIn2;
    }

}