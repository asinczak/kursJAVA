package pl.com.ttpsc.kursJava.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        Set zbior = new TreeSet();

        zbior.add("Z");
        zbior.add("C");
        zbior.add("G");
        zbior.add("A");
        zbior.add("K");

        System.out.println(zbior);


    }

}
