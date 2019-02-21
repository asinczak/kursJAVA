package pl.com.ttpsc.kursJava.wyklad_4;

public class Pilot {

    String marka;
    String ksztalt;
    String kolor;
    int glosnosc;

    Pilot (String marka) {
        //System.out.println("tworzę pilot z marką " + marka);
        this.marka = marka;
    }

    Pilot (String marka, String ksztalt) {
       this(marka);
       this.ksztalt = ksztalt;
    }

    Pilot (String marka, String ksztalt, String kolor) {
        this(marka, ksztalt);
        this.kolor = kolor;
    }



   void zrobGlosniej_o1 () {
        this.glosnosc++;

    }


    void zrobGlosniej_o10 () {
        this.glosnosc += 10;

    }


}
