package pl.com.ttpsc.kursJava.collections.iterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedListIterator {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Pies");
        linkedList.add(7);
        linkedList.add(new Object());

        ListIterator listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            Object next = listIterator.next();

            if (next.equals(7)) {
                //musimy sie cofnac o jeden, uzycie metody next powoduje zwrocenie kolejnego elementu i przestawienie iteratora na nastepny
                //element, jesli stosujemy next i previous po sobie, bedziemy caly czas ustawiac iterator na tym samym elemencie

                //nie przypisujemy obiektu, ktory zwraca previous do zmiennej, tutaj chodzi tylko o cofniecie iteratora
                listIterator.previous();
                if (listIterator.hasPrevious()) {
                    //dopiero to wywolanie previous zwroci nam element poprzedni, przed 7 czyli "Pies"
                    Object previous = listIterator.previous();
                    System.out.println("Poprzedni " + previous);
                    //wracamy iteratorem na pozycje na ktorej bylismy na poczatku tej iteracji
                    //trzeba przyznac, ze nie jest to najpiekniejsze rozwiazanie
                    listIterator.next();
                    listIterator.next();
                }
            }
        }
    }
}
