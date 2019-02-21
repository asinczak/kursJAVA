package pl.com.ttpsc.kursJava.Piotrek.collections;

import pl.com.ttpsc.kursJava.Bank.CurrentAccount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    static void wypisz(List lista) {
        lista.add("Kot");

        if (lista instanceof LinkedList) {
            LinkedList ll = (LinkedList) lista;
            ll.addFirst("Pelikan");
        }

    }


    public static void main(String[] args) {

        // referencja jest typu List ale implementacja, czyli obiekt ktry do niej przypisujemy
        //moze byc juz dowolnego typu ktry dziedziczy/implementuje Listę
        List listaObiektow = new ArrayList();
//        List listaObiektow = new LinkedList();
//        List listaObiektow = new java.util.Stack();

        listaObiektow.add("Pies");
        listaObiektow.add("Pies");
//        listaObiektow.add(new Account());
        listaObiektow.add(1);
        listaObiektow.add(true);
        listaObiektow.add(new Object());


        wypisz(listaObiektow);

        for (Object obj : listaObiektow) {
            System.out.println(obj);
        }


    }



}
