package pl.com.ttpsc.kursJava.collections.iterators;

import java.util.ArrayList;
import java.util.List;

public class TestForEachLoop {

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add("Pies");
        //typy proste nie moga byc przechowywane w kolekcjach, jednak tutaj nastepuje automatyczne opkowanie typu prostego int
        //obiektem typu Integer
        lista.add(7);
        lista.add(new Object());


        //obecnie najbardziej kompaktowa i polecana wersja petli loop, uzywajac jej nie musimy sie o nic martwic
        for (Object obj : lista) {
            System.out.println(obj);
        }

        //o nic oprocz usuwania, jesli chcemy usuwac musimy uzyc jednej z dwoch pozostalych wersji petli
        int i = 0;
        for (Object obj : lista) {
            System.out.println(obj);
            //to spowoduje wyrzucenie wyjatku, pod spodem uzywany jest iterator co w polaczeniu z proba uzycia
            // metody remove z interfejsu List spowoduje wyrzucenie wyjatku
            // do iteratora nie mamy tutaj niestety dostepu
            lista.remove(i);
            i++;
        }

    }
}
