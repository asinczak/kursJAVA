package pl.com.ttpsc.kursJava.XMLfileExercise;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class XMLfileServiceWithDOM {

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

    public  void readXMLfile (String fileName) {

        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fileName);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("pozycja");

            for (int i = 0; i < nList.getLength(); i++){

                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE){

                    Element eElement = (Element) nNode;

                    publicDate = doc.getDocumentElement().getElementsByTagName("data_publikacji").item(0).getTextContent();
                    shortDate = publicDate.substring(2);
                    shortDate = shortDate.replace("-","");

                    tableNumber = doc.getDocumentElement().getElementsByTagName("numer_tabeli").item(0).getTextContent();

                    currencyName = eElement.getElementsByTagName("nazwa_waluty").item(0).getTextContent();
                    CurrencyLists.getInstance().currencyNameList.add(currencyName);

                    convertion  = eElement.getElementsByTagName("przelicznik").item(0).getTextContent();
                    currencyCode  = convertion +" "+eElement.getElementsByTagName("kod_waluty").item(0).getTextContent();
                    CurrencyLists.getInstance().currencyCodeList.add(currencyCode);

                    averageRateString  = eElement.getElementsByTagName("kurs_sredni").item(0).getTextContent();
                    averageRateFloat = Float.parseFloat(averageRateString.replace(",","."));
                    if (shortDate.equals(FileService.getInstance().getDatefromFileIn1())) {
                        CurrencyLists.getInstance().averageRateListFileIn1.add(averageRateFloat);
                    }
                    else if (shortDate.equals(FileService.getInstance().getDatefromFileIn2())) {
                        CurrencyLists.getInstance().averageRateListFileIn2.add(averageRateFloat);
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
