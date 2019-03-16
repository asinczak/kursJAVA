package pl.com.ttpsc.kursJava.XMLfileExercise;

import org.xml.sax.helpers.DefaultHandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyExchangeRates extends DefaultHandler {

    private static final String FILE_NAME = "ExchangeRate.txt";
    List<String> list = new ArrayList<>();
    String fileIn1 = "";
    String fileIn2 = "";

    public List <String> readExchangeRateFile (){

        File file = new File(FILE_NAME);

        if (file.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

                String line = "";
                  while ((line = bufferedReader.readLine()) != null){
                      list.add(line);
                  }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("This file doesn't exist");
        }
        return list;
    }

    public String getFileIn1 (){
        list = readExchangeRateFile();
        String tab [] = list.get(0).split(": ");
        fileIn1 = tab [1];
        return fileIn1;
    }

    public String getFileIn2 () {
        list = readExchangeRateFile();
        String tab[] = list.get(1).split(": ");
        fileIn2 = tab[1];
        return fileIn2;
    }

//    public static void main(String[] args) {
//        CurrencyExchangeRates currencyExchangeRates = new CurrencyExchangeRates();
//        System.out.println(currencyExchangeRates.getFileIn1());
//    }
}
