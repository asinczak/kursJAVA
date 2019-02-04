package pl.com.ttpsc.kursJava.Piotrek.collections;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList <String> zwierzęta = new LinkedList();

        zwierzęta.add("lew");
        zwierzęta.add("kangur");
        zwierzęta.add("papuga");
        zwierzęta.add("pingwin");
        zwierzęta.add("krokodyl");

        zwierzęta.add(2, "hipopotam");
        zwierzęta.addLast("foka");
        zwierzęta.removeLast();

        System.out.println(zwierzęta);
        System.out.println(zwierzęta.getLast());

        for (int i = 0; i < zwierzęta.size(); i++) {
            if (zwierzęta.get(i) == "lew") {
                zwierzęta.addFirst("lwica");
                break;
            }
        }

        System.out.println(zwierzęta);


    }

}
