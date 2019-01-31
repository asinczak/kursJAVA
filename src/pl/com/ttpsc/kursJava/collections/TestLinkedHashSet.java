package pl.com.ttpsc.kursJava.collections;

import pl.com.ttpsc.kursJava.wyklad_6.Account;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        Set zbior = new LinkedHashSet();

        System.out.println(zbior.add("Pies"));
        //metoda add zwroci tym razem false czyli informacje o tym ze drugi raz String z wartoscia "Pies"
        //nie zostal dodany do Set'a
        System.out.println(zbior.add("Pies"));
        zbior.add(8);
        zbior.add(new Object());
        zbior.add(new Account("", 8));

        System.out.println();

        for (Object obj : zbior) {
            System.out.println(obj);
        }

    }

}
