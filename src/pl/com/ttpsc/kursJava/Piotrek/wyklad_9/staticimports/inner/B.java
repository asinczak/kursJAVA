package pl.com.ttpsc.kursJava.Piotrek.wyklad_9.staticimports.inner;


import pl.com.ttpsc.kursJava.Piotrek.wyklad_9.staticimports.A.*;
import pl.com.ttpsc.kursJava.Piotrek.wyklad_9.staticimports.A;

import static pl.com.ttpsc.kursJava.Piotrek.wyklad_9.staticimports.A.*;

public class B {

    int PI_B = 0;

    void oblicz() {
//        In i = new A().new In();
        double wynik = PI_B * PI;

        double wynik_2 = PI_B * E;

        A.wypisz();

    }

    void wypisz() {

    }

}
