package pl.com.ttpsc.kursJava.Piotrek.wyklad_7.widocznosc.pakietB;

public class TestWidocznoscPakietB {

    public static void main(String[] args) {
        Pochodna p = new Pochodna();
        //dostep do zmiennej o widocznosci protected poza pakietem i poza klasa dziedziczaca
        //nie da sie w ten sposob dobrac do takiej zmiennej

        //p.pakietowa = 0;

    }

}
