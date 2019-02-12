package pl.com.ttpsc.kursJava.Piotrek.wyklad_7.interfaces;

import java.util.ArrayList;
import java.util.List;

public class UzycieInterfejsu {

    public static void main(String[] args) {
        Czlowiek.powiedzZdzanie("mowie cos");

//        Czlowiek czlowiek = new Czlowiek() ;

        Czlowiek kobieta = new Kobieta();
        Czlowiek mezczyzna = new Mezczyzna();

        //
        Kobieta[] tablicaKobiet = new Kobieta[4];
        tablicaKobiet[0] = new Kobieta();
        //tablicaKobiet[0] = new Mezczyzna();


        Mezczyzna[] tablicaMezczyzn = new Mezczyzna[4];
        tablicaMezczyzn[0] = new Mezczyzna();
        //tablicaMezczyzn[0] = new Kobieta();

        //
        Czlowiek[] tablicaLudzi = new Czlowiek[2];
        tablicaLudzi[0] = new Kobieta();
        tablicaLudzi[1] = new Mezczyzna();

        System.out.println("Karmimy ludzi");
        for (Czlowiek czlowiek : tablicaLudzi) {
            czlowiek.jedz();
        }

        List<Czlowiek> listaLudzi = new ArrayList();
        listaLudzi.add(new Mezczyzna());

        /////////////////////////////
        KotDomowy kotDomowy_1 = new KotDomowy();
        Lampart lampart_1 = new Lampart();

        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Mezczyzna());
        zwierzeta.add(new Kobieta());
        zwierzeta.add(kotDomowy_1);
        zwierzeta.add(lampart_1);

        for (Zwierze zwierz : zwierzeta) {
            zwierz.jedz();
        }

        List<Kot> koty = new ArrayList<>();
        koty.add(lampart_1);
        koty.add(kotDomowy_1);

        for(Kot kot : koty) {
            kot.poluj();
        }

    }
}
