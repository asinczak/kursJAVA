package pl.wyklad.czwarty;

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



    int zrobGlosniej_o1 () {
        this.glosnosc++;
        return glosnosc;
    }


    int zrobGlosniej_o10 () {
        this.glosnosc += 10;
        return this.glosnosc;
    }


}
