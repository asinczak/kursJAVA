package pl.com.ttpsc.kursJava.wyklad_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CzlowiekTest {

    public static void main(String[] args) {

        Map<Czlowiek, String> map = new HashMap<>();

        Czlowiek czlowiek1 = new Czlowiek(30, 165, 58, 'k');
        Czlowiek czlowiek2 = new Czlowiek(18, 178, 89, 'm');
        Czlowiek czlowiek3 = new Czlowiek(50, 168, 70, 'k');
        Czlowiek czlowiek4 = new Czlowiek(45, 175, 70, 'm');
        Czlowiek czlowiek5 = new Czlowiek(45, 175, 70, 'm');

        map.put(czlowiek1, "Bąk");
        map.put(czlowiek2, "Lis");
        map.put(czlowiek3, "Wilk");
        map.put(czlowiek4, "Karaś");
        map.put(czlowiek5, "Kogut");

        System.out.println(czlowiek4.equals(czlowiek5));
        System.out.println(czlowiek4.equals(czlowiek1));

        Set<Map.Entry<Czlowiek, String>> entrySet = map.entrySet();

        for (Map.Entry<Czlowiek, String> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Iterator<Map.Entry<Czlowiek, String>> it = map.entrySet().iterator();

        while (it.hasNext()){
           Map.Entry <Czlowiek,String> entry = it.next();
            if (entry.getKey().equals(czlowiek2)){
                it.remove();
            }
        }
        System.out.println("po usunięciu elementu");

        map.forEach( (key, value) -> {
            System.out.println(key +" - "+ value);
        });


    }
}
