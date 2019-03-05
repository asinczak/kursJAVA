package pl.com.ttpsc.kursJava.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Generics <T> {

    T element;

    public  Generics (T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public static void main(String[] args) {

        List<Generics> list = new ArrayList<>();

        Generics<String> gen1 = new Generics<>("dog");
        Generics<String> gen2 = new Generics<>("cat");
        Generics<String> gen3 = new Generics<>("fish");

        Generics<Integer> gen4 = new Generics<>(5);
        Generics<Integer> gen5 = new Generics<>(10);
        Generics<Integer> gen6 = new Generics<>(15);

        list.add(gen1);
        list.add(gen2);
        list.add(gen3);
        list.add(gen4);
        list.add(gen5);
        list.add(gen6);

        for (Generics gen : list){
            System.out.println(gen.getElement());
        }
    }
}
