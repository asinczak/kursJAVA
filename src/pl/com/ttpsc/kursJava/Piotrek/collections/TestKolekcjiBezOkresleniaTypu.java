package pl.com.ttpsc.kursJava.Piotrek.collections;

import pl.com.ttpsc.kursJava.Bank.CurrentAccount;

import java.util.ArrayList;
import java.util.List;

public class TestKolekcjiBezOkresleniaTypu {

    public static void main(String[] args) {

        List listaObiektow = new ArrayList();

        //do listy mozemy teraz dodac wszystko, nigdy nie wiemy pry wyjmowaniu jaki to moze byc obiekt
        //dlatego musimy stosowac operator instanceof -> to bylo prawda jeszcze pare lat temu
        listaObiektow.add("Pies");
        listaObiektow.add(1);
        listaObiektow.add(true);
        listaObiektow.add(new Object());
//        listaObiektow.add(new CurrentAccount());


        for (int i = 0; i < listaObiektow.size(); i++) {
            Object obj = listaObiektow.get(i);

            if (obj instanceof Integer) {
                Integer elem = (Integer) obj;
                elem.byteValue();
            }

            if (obj instanceof CurrentAccount) {
                //obsluga obiektu Account
            }

            if (obj instanceof String) {
                //obsluga obiektu String
            }
        }


    }


}
