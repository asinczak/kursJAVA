package pl.com.ttpsc.kursJava.wyklad_7.ZadanieKaczki;

public class TestKaczek {

    public static void main(String[] args) {

        Kwakanie kwakanie = new NieKwacz();
        Kwakanie kwakanie1 = new Kwacz();
        Kwakanie kwakanie2 = new Piszcz();

        Latanie latanie = new LatamBoMamSkrzydla();
        Latanie latanie1 = new NieLatam();

       DzikaKaczka dzikaKaczka = new DzikaKaczka();
         dzikaKaczka.wyswietl();
         dzikaKaczka.plywaj();

         dzikaKaczka.setKwakanie(kwakanie1);
         dzikaKaczka.wykonajKwacz();

         dzikaKaczka.setLatanie(latanie);
         dzikaKaczka.wykonajLec();

        System.out.println("============================");

        GumowaKaczka gumowaKaczka = new GumowaKaczka();
        gumowaKaczka.wyswietl();
        gumowaKaczka.plywaj();

        gumowaKaczka.setKwakanie(kwakanie2);
        gumowaKaczka.wykonajKwacz();

        gumowaKaczka.setLatanie(latanie1);
        gumowaKaczka.wykonajLec();

        System.out.println("============================");

        PlaskonosKaczka plaskonosKaczka = new PlaskonosKaczka();

        plaskonosKaczka.wyswietl();
        plaskonosKaczka.plywaj();

        plaskonosKaczka.setKwakanie(kwakanie);
        plaskonosKaczka.wykonajKwacz();

        plaskonosKaczka.setLatanie(latanie);
        plaskonosKaczka.wykonajLec();

        System.out.println("============================");

        WabikKaczka wabikKaczka = new WabikKaczka();

        wabikKaczka.wyswietl();
        wabikKaczka.plywaj();

        wabikKaczka.setKwakanie(kwakanie1);
        wabikKaczka.wykonajKwacz();
        wabikKaczka.setKwakanie(kwakanie2);
        wabikKaczka.wykonajKwacz();

        wabikKaczka.setLatanie(latanie1);
        wabikKaczka.wykonajLec();

    }
}
