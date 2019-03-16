package pl.com.ttpsc.kursJava.XMLfileExercise;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;


public class ReadXMLfile {

    CurrencyExchangeRates cer = new CurrencyExchangeRates();


    List<Currency> currencylist = new ArrayList<>();

    String tableNumber;
    String publicDate;
    String currencyName;
    String convertion;
    String currencyCode;
    String averageRate;
    Currency currency = new Currency(currencyName, currencyCode, averageRate);

    String getTableNumber (){
        return tableNumber;
    }

    String getPublicDate (){
        return publicDate;
    }

    List getcurrencylist (){
        return currencylist;
    }


    public List readFile () {


        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {

                boolean btablenumber = false;
                boolean bpublicdata = false;
                boolean bcurrencyname = false;
                boolean bconversion = false;
                boolean bcurrencycode = false;
                boolean baveragerate = false;


                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

                    if (qName.equalsIgnoreCase("numer_tabeli")) {
                        btablenumber = true;
                    }
                    if (qName.equalsIgnoreCase("data_publikacji")) {
                        bpublicdata = true;
                    }
                    if (qName.equalsIgnoreCase("nazwa_waluty")) {
                        bcurrencyname = true;
                    }
                    if (qName.equalsIgnoreCase("przelicznik")) {
                        bconversion = true;
                    }
                    if (qName.equalsIgnoreCase("kod_waluty")) {
                        bcurrencycode = true;
                    }
                    if (qName.equalsIgnoreCase("kurs_sredni")) {
                        baveragerate = true;
                    }
                }

//                public void endElement (String uri, String localName, String qname) throws SAXException {
//
//                }

                public void characters(char ch[], int start, int length) throws SAXException {


                    if (btablenumber) {
                        tableNumber = new String(ch, start, length);
                        btablenumber = false;
                    }
                    if (bpublicdata) {
                        publicDate = new String(ch, start, length);
                        bpublicdata = false;
                    }
                    if (bcurrencyname){
                        currencyName = new String(ch, start, length);

                        bcurrencyname = false;
                    }
                    if (bconversion){
                        convertion = new String(ch, start, length);
                        bconversion = false;
                    }
                    if (bcurrencycode){
                        currencyCode = convertion +" "+new String(ch, start, length);

                        bcurrencycode = false;
                    }
                    if (baveragerate){
                        averageRate = new String(ch, start, length);

                        baveragerate = false;
                    }

                    currencylist.add(currency);
                }


            };

            saxParser.parse(cer.getFileIn1(), defaultHandler);


        } catch (Exception e) {
            e.printStackTrace();
        }
            return currencylist;
    }


    public static void main(String[] args) {
        ReadXMLfile file = new ReadXMLfile();


        System.out.println(file.readFile());

    }

}
