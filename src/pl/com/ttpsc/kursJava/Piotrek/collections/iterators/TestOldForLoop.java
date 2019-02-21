package pl.com.ttpsc.kursJava.Piotrek.collections.iterators;

import java.util.ArrayList;
import java.util.List;

public class TestOldForLoop {

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add("Pies");
        //typy proste nie moga byc przechowywane w kolekcjach, jednak tutaj nastepuje automatyczne opkowanie typu prostego int
        //obiektem typu Integer
        lista.add(7);
        lista.add(new Object());

        //stary dobry for z licznikiem
        for (int i = 0; i < lista.size(); i++) {
            Object objectFromList = lista.get(i);
            System.out.println(objectFromList);
        }

        //przy takim uzyciu, mozna zastosowac metode remove z interfeju List
        for (int i = 0; i < lista.size(); i++) {
            Object objectFromList = lista.get(i);

            //sprawdzamy czy dany element wyjety z listy jest typu Integer
            if (objectFromList instanceof Integer) {
                //opcja metody remove z podaniem indeksu elementu do usunieca
                lista.remove(i);
            }
        }

        //ladnie wyswietla wszystkie elementy zawarte w liscie, nie potrzebujemy uzywac do tego zadnej petli
        System.out.println(lista);


    }
}
