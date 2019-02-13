package pl.com.ttpsc.kursJava.wyklad_7.ZadanieKaczki;

public class Kaczka  {

    Kwakanie kwakanie;
    Latanie latanie;

    public void wykonajKwacz (){
        kwakanie.kwacz();
    }

    public void wykonajLec () {
        latanie.lec();
    }

    public void plywaj () {
        System.out.println("Pływam");
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
