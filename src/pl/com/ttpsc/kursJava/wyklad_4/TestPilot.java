package pl.com.ttpsc.kursJava.wyklad_4;

public class TestPilot {

    public static void main(String[] args) {

        Pilot pilot1 = new Pilot("Manta");
        System.out.println("Pliot 1 jest marki " + pilot1.marka);


        Pilot pilot2 = new Pilot("SONY", "kwadrat");
        System.out.println("Pilot 2 jest marki " + pilot2.marka + " i kształtu : " + pilot2.ksztalt);

        Pilot pilot3 = new Pilot("LG", "prostokat", "biały");
        System.out.println("Pilot 3 jest marki " + pilot3.marka + " i kształtu : " + pilot3.ksztalt + " oraz ma kolor " + pilot3.kolor);


        pilot1.zrobGlosniej_o1();
        pilot1.zrobGlosniej_o1();
        pilot1.zrobGlosniej_o1();
        pilot1.zrobGlosniej_o1();

        System.out.println(pilot1.glosnosc);


        pilot2.zrobGlosniej_o10();
        pilot2.zrobGlosniej_o10();
        pilot2.zrobGlosniej_o10();

        System.out.println(pilot2.glosnosc);
    }
}
