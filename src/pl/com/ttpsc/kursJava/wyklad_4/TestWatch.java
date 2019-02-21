package pl.com.ttpsc.kursJava.wyklad_4;

public class TestWatch {

    public static void main(String[] args) {
        Watch zegarek1 = new Watch (15, 15);
        Watch zegarek2 = new Watch (10, 40);
        Watch zegarek3 = new Watch (23, 01);
        Watch zegarek4 = new Watch (16);


        System.out.println("Zegarek 1 wyświetla godzinę " + zegarek1.hours + " : " + zegarek1.minutes);
        System.out.println("Zegarek 2 wyświetla godzinę " + zegarek2.hours + " : " + zegarek2.minutes);
        System.out.println("Zegarek 3 wyświetla godzinę " + zegarek3.hours + " : " + zegarek3.minutes);
        System.out.println("Zegarek 4 wyświetla godzinę " + zegarek4.hours);

    }
}
