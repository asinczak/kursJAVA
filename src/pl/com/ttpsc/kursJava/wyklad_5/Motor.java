package pl.com.ttpsc.kursJava.wyklad_5;

public class Motor extends Pojazd {

    private static final int ILOSC_KOL = 2;

    public Motor (Silnik silnik) {
        super (ILOSC_KOL, false, silnik);
    }

    public void wlaczSilnik () {
        super.wlaczSilnik ();
        String dzwiek = silnik.glosSilnika();
        System.out.println(dzwiek);
    }

}
