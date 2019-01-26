package pl.com.ttpsc.kursJava.wyklad_5;

public class TestPojazdów {

    public static void main(String[] args) {

        Silnik silnikSamochodowy = new Silnik("Brum Brum Brum");

        Samochod volvo = new Samochod(silnikSamochodowy);
        volvo.wlaczSilnik();
        volvo.jade();
        volvo.wylaczSilnik();
        System.out.println("====================================");

        Silnik motorowy = new Silnik("Wrym Wrym Wrym");
        Motor romet = new Motor(motorowy);
        romet.wlaczSilnik();
        romet.jade();
        romet.wylaczSilnik();
        System.out.println("=====================================");

        Rower rower = new Rower (2);
        rower.jade();
    }
}
