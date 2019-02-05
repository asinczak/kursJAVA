package pl.com.ttpsc.kursJava.Piotrek.collections;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {

        Map <Integer, String> employees = new TreeMap<>();

        employees.put(1,"Jan Kowlski");
        employees.put(2, "Mikołaj Święty");
        employees.put(3, "Zuzanna Piękna");
        employees.put(4, "Anna Woolf");

        System.out.println("Ilość pracowników: " + employees.size());

        Set <Integer> keySet = employees.keySet();
        System.out.println("klucze:\n" + keySet);

        Collection <String> values = employees.values();
        System.out.println("wartości:\n" + values);

        Set <Entry <Integer, String>> entrySet = employees.entrySet();
        for (Entry <Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
