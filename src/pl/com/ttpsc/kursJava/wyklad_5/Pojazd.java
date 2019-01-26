package pl.com.ttpsc.kursJava.wyklad_5;

public class Pojazd {

    int iloscKol;
    boolean koloZapasowe;
    Silnik silnik;

    public Pojazd (int iloscKol, boolean koloZapasowe, Silnik silnik) {
        this.iloscKol = iloscKol;
        this.koloZapasowe = koloZapasowe;
        this.silnik = silnik;
    }

    public Pojazd (int iloscKol, boolean koloZapasowe) {
        this.iloscKol = iloscKol;
        this.koloZapasowe = koloZapasowe;
    }

    public void jade () {
        System.out.println("Jadę");
    }

    public void wylaczSilnik () {
        System.out.println("Wyłączam silnik");
    }

    public void wlaczSilnik () {
        System.out.println("Włączam silnik");
    }
}
