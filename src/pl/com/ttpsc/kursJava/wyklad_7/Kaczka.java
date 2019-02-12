package pl.com.ttpsc.kursJava.wyklad_7;

public class Kaczka implements Latanie, Kwakanie {

    Kwakanie kwakanie;
    Latanie latanie;

    @Override
    public void kwacz() {

    }

    @Override
    public void lec() {

    }

    public void plywaj () {
        System.out.println("Pływaj");
    }

    public void wyswietl () {
    }

    public void setKwakanie (Kwakanie kwakanie){
        this.kwakanie = kwakanie;
    }

    public void setLatanie (Latanie latanie) {
        this.latanie = latanie;
    }
}
