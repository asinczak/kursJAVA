package pl.com.ttpsc.kursJava.wyklad_7.widocznosc.pakietB;

import pl.com.ttpsc.kursJava.wyklad_7.widocznosc.pakietA.Baza;

public class TestWidocznoscPakietB {

    public static void main(String[] args) {
        Pochodna p = new Pochodna();
        //dostep do zmiennej o widocznosci protekted poza pakietem i poza klasa dziedziczaca

        p.pakietowa = 0;

    }

}
