package pl.com.ttpsc.kursJava.wyklad_7.widocznosc.pakietB;

import pl.com.ttpsc.kursJava.wyklad_7.widocznosc.pakietA.Baza;

public class Pochodna extends Baza {

    void oblicz() {
        //zmienna o widocznosci protected jest widoczna tylko w tym samym pakiecie lub w klasach dziedziczacych,
        //ktore moga znajdowac się w innych pakietach
        pakietowa = 0;
    }


}
