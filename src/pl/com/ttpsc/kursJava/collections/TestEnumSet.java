package pl.com.ttpsc.kursJava.collections;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class TestEnumSet {


    public static void main(String[] args) {

        //zbior ktory potrafi przechowywac enumy
        EnumSet weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY, Days.SATURDAY);

        //zwkyly set tez potrafi, z dokumentacji wynika ze EnumSet jest szybszy przy enum'ach
        Set zbiorEnumow= new HashSet();
        zbiorEnumow.add(Days.SATURDAY);

        System.out.println(zbiorEnumow);

        System.out.println(weekend);

        System.out.println(Miesiace.LUTY.miesiac);

        //wartosci typu wyliczeniowego mozemy tworzyc tylko wewnatrz enum'a
        //Miesiace grudzien = new Miesiace(12);

    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

enum Miesiace {
    STYCZEN(1),LUTY(2),MARZE(3);

    int miesiac;

    Miesiace(int miesiac) {
        this.miesiac = miesiac;
    }

}