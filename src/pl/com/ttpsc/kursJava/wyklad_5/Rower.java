package pl.com.ttpsc.kursJava.wyklad_5;

public class Rower extends Pojazd {

    public static final boolean KOLO_ZAPASOWE = false;

    Rower (int iloscKol) {
        super (iloscKol, KOLO_ZAPASOWE);
    }
}
