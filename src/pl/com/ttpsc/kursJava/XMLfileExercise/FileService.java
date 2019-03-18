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
    XMLfileService xmLfileService = new XMLfileService();
    File fileWithTable = new File("ExchangeRateTable.txt");

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

    public void writeToFile () {
        List <String> differentInExchange = new ArrayList<>();

        xmLfileService.readFile(getFileIn1());

        String tableNumberFileIn1 = xmLfileService.getTableNumber();
        String dataFileIn1 = xmLfileService.getPublicDate();

        List <String> currencyNameFileIn1 = CurrencyList.getInstance().getCurrencyNameList();
        List <String> currencyCodeFileIn1 = CurrencyList.getInstance().getCurrencyCodeList();
        List <Float> averageRateFileIn1 = CurrencyList.getInstance().getAverageRateListFileIn1();

        xmLfileService.readFile(getFileIn2());

        String tableNumberFileIn2 = xmLfileService.getTableNumber();
        String dataFileIn2 = xmLfileService.getPublicDate();

        List <Float> averageRateFileIn2 = CurrencyList.getInstance().getAverageRateListFileIn2();

        for (int i = 0; i < averageRateFileIn1.size(); i++){
            float singleDifferentInExchangeFileIn1 = averageRateFileIn1.get(i);
            float singleDifferentInExchangeFileIn2 = averageRateFileIn2.get(i);
            BigDecimal singleDifferentInExchange = BigDecimal.valueOf(singleDifferentInExchangeFileIn1 - singleDifferentInExchangeFileIn2);
            differentInExchange.add(numberformat(singleDifferentInExchange));
        }



        try (Writer writer = new FileWriter(fileWithTable)){

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

        if (fileWithTable.exists()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileWithTable))){
                String line = "";
                if ((line = bufferedReader.readLine()) != null){
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

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileHTMLtable))){

                String firstLine = listLinesFromTable.get(0);
                printWriter.println("<TABLE>\n<HEAD>"+firstLine+"</HEAD>");
                printWriter.println("<TR><TH>"+HEADING_1+"\t<TH>"+HEADING_2+"\t<TH>"+HEADING_3+"\t<TH>"+HEADING_4+"</TH></TR>");


                printWriter.println("</TABLE>");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
