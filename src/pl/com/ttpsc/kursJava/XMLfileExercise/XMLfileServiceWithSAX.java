package pl.com.ttpsc.kursJava.XMLfileExercise;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLfileServiceWithSAX {

    String publicDate;
    String currencyName;
    String convertion;
    String currencyCode;
    String averageRateString;
    float averageRateFloat;
    String tableNumber;
    String shortDate;

    String getTableNumber (){
        return tableNumber;
    }

    String getPublicDate (){
        return publicDate;
    }


    public void readFile (String file){
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

                public void characters(char ch[], int start, int length) throws SAXException {

                    if (btablenumber) {
                        tableNumber = new String(ch, start, length);
                        btablenumber = false;
                    }
                    if (bpublicdata) {
                        publicDate = new String(ch, start, length);
                        shortDate = publicDate.substring(2);
                        shortDate = shortDate.replace("-","");
                        bpublicdata = false;
                    }
                    if (bcurrencyname){
                        currencyName = new String(ch, start, length);
                        CurrencyLists.getInstance().currencyNameList.add(currencyName);
                        bcurrencyname = false;
                    }
                    if (bconversion){
                        convertion = new String(ch, start, length);
                        bconversion = false;
                    }
                    if (bcurrencycode){
                        currencyCode = convertion +" "+new String(ch, start, length);
                        CurrencyLists.getInstance().currencyCodeList.add(currencyCode);
                        bcurrencycode = false;
                    }
                    if (baveragerate){
                        averageRateString = new String(ch, start, length);
                        averageRateFloat = Float.parseFloat(averageRateString.replace(',','.'));
                        if (shortDate.equals(FileService.getInstance().getDatefromFileIn1())) {
                            CurrencyLists.getInstance().averageRateListFileIn1.add(averageRateFloat);
                        }
                        else if (shortDate.equals(FileService.getInstance().getDatefromFileIn2())) {
                            CurrencyLists.getInstance().averageRateListFileIn2.add(averageRateFloat);
                        }

                        baveragerate = false;
                    }
                }
            };

            saxParser.parse(file, defaultHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
