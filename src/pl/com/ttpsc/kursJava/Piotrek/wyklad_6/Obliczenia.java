package pl.com.ttpsc.kursJava.Piotrek.wyklad_6;

public class Obliczenia {

    static int licznik = 0;
    int zmienna = 0;

    Obliczenia() {
        licznik++;
        zmienna++;
    }

    public void przedstawSie() {
        System.out.println("Hej (nie statycznie), zmienna = " + zmienna + ", licznik = " + licznik);
    }

    public static void przedstawSieStatycznie() {
        System.out.println("Hej (statycznie), zmienna = (nie istnieje jeszcze), licznik = " + licznik);
    }

    public int obliczObjetosc(int width, int height, int depth) {
         return width * height * depth;
    }

    public static int obliczObjetoscStatic(int width, int height, int depth) {
        return width * height * depth;
    }

}
