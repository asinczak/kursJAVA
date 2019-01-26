package pl.com.ttpsc.kursJava.wyklad_5;

public class Samochod extends Pojazd {

    private static final int ILOSC_KOL = 4;

    public Samochod (Silnik silnik) {
        super (ILOSC_KOL, true, silnik);
    }

    public void wlaczSilnik () {
        super.wlaczSilnik();
        System.out.println(silnik.glosSilnika());
        System.out.println("Proszę zapiąć pasy");
        int iloscKol = super.iloscKol;
        System.out.println("Samochó posiada " + iloscKol + " koła");
    }
}
