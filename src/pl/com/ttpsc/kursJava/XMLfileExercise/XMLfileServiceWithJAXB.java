package pl.com.ttpsc.kursJava.XMLfileExercise;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;


public class XMLfileServiceWithJAXB  {


    public static Currencies readFile (String fileName) {
        Currencies currencies = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Currencies.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            currencies = (Currencies) unmarshaller.unmarshal(new URL(fileName));


        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return currencies;
    }


}
