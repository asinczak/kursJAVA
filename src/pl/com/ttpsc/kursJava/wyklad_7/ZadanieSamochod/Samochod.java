package pl.com.ttpsc.kursJava.wyklad_7.ZadanieSamochod;

public class Samochod {

    Silnik silnik;

    public void setSilnik (Silnik silnik) {
        this.silnik = silnik;
    }

    public void jakiSilnik (){
        silnik.wybierzSilnik();
    }


    public static void main(String[] args) {

        Silnik silnik1 = new Benzyna();
        Silnik silnik2 = new Diesel();
        Silnik silnik3 = new Hybryda();

        Samochod volvo = new Samochod();
        Samochod audi = new Samochod();
        Samochod dacia = new Samochod();


        volvo.setSilnik(silnik2);
        volvo.jakiSilnik();

        audi.setSilnik(silnik3);
        audi.jakiSilnik();

        dacia.setSilnik(silnik1);
        dacia.jakiSilnik();

    }

}
