package pl.com.ttpsc.kursJava.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLoopWithIterator {

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add("Pies");
        //typy proste nie moga byc przechowywane w kolekcjach, jednak tutaj nastepuje automatyczne opkowanie typu prostego int
        //obiektem typu Integer
        lista.add(7);
        lista.add(new Object());

        //metoda iterator() z interfejsu List zwraca nam instancje iteratora, ktorym mozemy przejsc przez kolekcje
        Iterator iterator = lista.iterator();
        //najpierw musimy sprawdzic czy kolejny element w liscie istnieje  przy uzyciu metody hasNext
        while(iterator.hasNext()) {
            //jesli istnieje, weszlo w petle, to pobieramy kolejny element korzystajac z metody next
            Object next = iterator.next();
        }

        System.out.println(lista);

        //test usuwania przy uzyciu iteratora
        Iterator iteratorRemove = lista.iterator();
        while(iteratorRemove.hasNext()) {
            Object next = iteratorRemove.next();

            if (next instanceof Integer) {
                //iterator posiada metoda remove ktora usuwa biezacy element z listy
                //nie mozemy uzyc metody remove z interfejsu List, spowodowalo by to wyrzucenie wyjatku
                iteratorRemove.remove();
            }

        }

        System.out.println(lista);

    }
}
