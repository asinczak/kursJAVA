package pl.com.ttpsc.kursJava.XMLfileExercise;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private static final FileService fileService = new FileService();

    private FileService (){}

    public static FileService getInstance(){
        return fileService;
    }

    private static final String FILE_NAME = "ExchangeRate.txt";
    private static final String HEADING_1 = "Nazwa waluty";
    private static final String HEADING_2 = "Kod waluty";
    private static final String HEADING_3 = "Kurs średni";
    private static final String HEADING_4 = "Zmiana";

    List<String> listWithHTTP = new ArrayList<>();
    List <String> listLinesFromTable = new ArrayList<>();
    String fileIn1 = "";
    String fileIn2 = "";
    XMLfileServiceWithSAX xmLfileService = new XMLfileServiceWithSAX();
    XMLfileServiceWithDOM xmLfileServiceWithDOM = new XMLfileServiceWithDOM();
    File fileWithTableUsingSax = new File("ExchangeRateTableUsingSax.txt");
    File fileTithTableUsingDOM = new File("ExchangeRateTableUsingDOM.txt");
    File fileTithTableUsingJAXB = new File("ExchangeRateTableUsingJAXB.txt");

    public List<String> readExchangeRateFile() {

        File file = new File(FILE_NAME);

        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    listWithHTTP.add(line);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("This file doesn't exist");
        }
        return listWithHTTP;
    }

    public String getFileIn1() {
        listWithHTTP = readExchangeRateFile();
        String tab[] = listWithHTTP.get(0).split(": ");
        fileIn1 = tab[1];
        return fileIn1;
    }

    public String getFileIn2() {
        listWithHTTP = readExchangeRateFile();
        String tab[] = listWithHTTP.get(1).split(": ");
        fileIn2 = tab[1];
        return fileIn2;
    }

    public String getDatefromFileIn1 () {
        String date = getFileIn1().substring(34,40);
        return date;
    }

    public String getDatefromFileIn2 () {
        String date = getFileIn2().substring(34,40);
        return date;
    }

    public String numberformat (BigDecimal bigDecimal){
        NumberFormat format = new DecimalFormat("0.0000");
          String bigDecimalFormat = format.format(bigDecimal);
            return bigDecimalFormat;
    }

    public void writeToFileUsingSax () {
        List <String> differentInExchange = new ArrayList<>();

        xmLfileService.readFile(getFileIn1());

        String tableNumberFileIn1 = xmLfileService.getTableNumber();
        String dataFileIn1 = xmLfileService.getPublicDate();

        List <String> currencyNameFileIn1 = CurrencyLists.getInstance().getCurrencyNameList();
        List <String> currencyCodeFileIn1 = CurrencyLists.getInstance().getCurrencyCodeList();
        List <Float> averageRateFileIn1 = CurrencyLists.getInstance().getAverageRateListFileIn1();

        xmLfileService.readFile(getFileIn2());

        String tableNumberFileIn2 = xmLfileService.getTableNumber();
        String dataFileIn2 = xmLfileService.getPublicDate();

        List <Float> averageRateFileIn2 = CurrencyLists.getInstance().getAverageRateListFileIn2();

        for (int i = 0; i < averageRateFileIn1.size(); i++){
            float singleDifferentInExchangeFileIn1 = averageRateFileIn1.get(i);
            float singleDifferentInExchangeFileIn2 = averageRateFileIn2.get(i);
            BigDecimal singleDifferentInExchange = BigDecimal.valueOf(singleDifferentInExchangeFileIn1 - singleDifferentInExchangeFileIn2);
            differentInExchange.add(numberformat(singleDifferentInExchange));
        }

        try (Writer writer = new FileWriter(fileWithTableUsingSax)){

            String header = "Tabela nr "+tableNumberFileIn1+" z dnia "+dataFileIn1+" w porównaniu z tabelą nr "+tableNumberFileIn2
                    +" z dnia " + dataFileIn2;

            writer.write(header );
            writer.write("\n" +HEADING_1 +"\t"+ HEADING_2+"\t"+ HEADING_3 +"\t" + HEADING_4);
            for (int i = 0; i < averageRateFileIn1.size(); i++){

                writer.write("\n" +currencyNameFileIn1.get(i)+"\t"+ currencyCodeFileIn1.get(i)+ "\t"+averageRateFileIn1.get(i)+"\t"+ differentInExchange.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileWithTable () {

        if (fileWithTableUsingSax.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileWithTableUsingSax))){
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    listLinesFromTable.add(line);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("File doesn't exist");
        }
    }

    public void createHTMLtable () {
        readFileWithTable();

        File fileHTMLtable = new File("ExchangeRateTableInHTML.html");

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileHTMLtable))){

                String firstLine = listLinesFromTable.get(0);
                printWriter.println("<TABLE>\n<HEAD>"+firstLine+"</HEAD>");
                printWriter.println("<TR><TH>"+HEADING_1+"\t<TH>"+HEADING_2+"\t<TH>"+HEADING_3+"\t<TH>"+HEADING_4+"</TH></TR>");
                for (int i = 2; i < listLinesFromTable.size(); i++){
                    String [] nextLines = listLinesFromTable.get(i).split(" ");
                    String line = nextLines[0];
//                    System.out.println(line);

//                    printWriter.println("<TR><TH>" + nextLines + "</TH></TR>");
                }


                printWriter.println("</TABLE>");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileUsingDOM () {
        List<String> differentInExchange = new ArrayList<>();

        xmLfileServiceWithDOM.readXMLfile(getFileIn1());

        String tableNumberFileIn1 = xmLfileServiceWithDOM.getTableNumber();
        String dataFileIn1 = xmLfileServiceWithDOM.getPublicDate();

        List<String> currencyNameFileIn1 = CurrencyLists.getInstance().getCurrencyNameList();
        List<String> currencyCodeFileIn1 = CurrencyLists.getInstance().getCurrencyCodeList();
        List<Float> averageRateFileIn1 = CurrencyLists.getInstance().getAverageRateListFileIn1();

        xmLfileServiceWithDOM.readXMLfile(getFileIn2());

        String tableNumberFileIn2 = xmLfileServiceWithDOM.getTableNumber();
        String dataFileIn2 = xmLfileServiceWithDOM.getPublicDate();

        List<Float> averageRateFileIn2 = CurrencyLists.getInstance().getAverageRateListFileIn2();

        for (int i = 0; i < averageRateFileIn1.size(); i++) {
            float singleDifferentInExchangeFileIn1 = averageRateFileIn1.get(i);
            float singleDifferentInExchangeFileIn2 = averageRateFileIn2.get(i);
            BigDecimal singleDifferentInExchange = BigDecimal.valueOf(singleDifferentInExchangeFileIn1 - singleDifferentInExchangeFileIn2);
            differentInExchange.add(numberformat(singleDifferentInExchange));
        }

        try (Writer writer = new FileWriter(fileTithTableUsingDOM)){

            String header = "Tabela nr "+tableNumberFileIn1+" z dnia "+dataFileIn1+" w porównaniu z tabelą nr "+tableNumberFileIn2
                    +" z dnia " + dataFileIn2;

            writer.write(header );
            writer.write("\n" +HEADING_1 +"\t"+ HEADING_2+"\t"+ HEADING_3 +"\t" + HEADING_4);
            for (int i = 0; i < averageRateFileIn1.size(); i++){

                writer.write("\n" +currencyNameFileIn1.get(i)+"\t"+ currencyCodeFileIn1.get(i)+ "\t"+averageRateFileIn1.get(i)+"\t"+ differentInExchange.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileUsingJAXB () {
        List<String> differentInExchange = new ArrayList<>();

        Currencies currenciesFile1 = XMLfileServiceWithJAXB.readFile(getFileIn1());

        String tableNumberFileIn1 = currenciesFile1.getTableNumber();
        String dataFileIn1 = currenciesFile1.getPublicDate();

        List <Currency> listFileIn1 = currenciesFile1.getCurrencyList();

        Currencies currenciesFile2 = XMLfileServiceWithJAXB.readFile(getFileIn2());

        String tableNumberFileIn2 = currenciesFile2.getTableNumber();
        String dataFileIn2 = currenciesFile2.getPublicDate();

        List <Currency> listFileIn2 = currenciesFile2.getCurrencyList();

        List<String> listAverageRateFile1 = new ArrayList<>();
        List<String> listAverageRateFile2 = new ArrayList<>();

        for (Currency currency1 : listFileIn1) {
            String averageRateStringFile1 = currency1.getAverageRate();
            listAverageRateFile1.add(averageRateStringFile1);
            }

        for (Currency currency2 : listFileIn2) {
            String averageRateStringFile2 = currency2.getAverageRate();
            listAverageRateFile2.add(averageRateStringFile2);
        }

        for (int i = 0; i <listAverageRateFile1.size(); i++){
            float averageRateFile1 = Float.parseFloat(listAverageRateFile1.get(i).replace(",","."));
            float averageRateFile2 = Float.parseFloat(listAverageRateFile2.get(i).replace(",","."));
            BigDecimal singleDifferentInExchange = BigDecimal.valueOf(averageRateFile1 - averageRateFile2);
            differentInExchange.add(numberformat(singleDifferentInExchange));
        }
        try (Writer writer = new FileWriter(fileTithTableUsingJAXB)){

            String header = "Tabela nr "+tableNumberFileIn1+" z dnia "+dataFileIn1+" w porównaniu z tabelą nr "+tableNumberFileIn2
                    +" z dnia " + dataFileIn2;

            writer.write(header );
            writer.write("\n" +HEADING_1 +"\t"+ HEADING_2+"\t"+ HEADING_3 +"\t" + HEADING_4);
            for (int i = 0; i< listFileIn1.size(); i++){

                writer.write("\n" +listFileIn1.get(i).getCurrencyName()+"\t"+listFileIn1.get(i).getConversion()+ "\t"+listFileIn1.get(i).currencyCode+"\t"
                        + listFileIn1.get(i).getAverageRate()+ "\t"+differentInExchange.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    }
