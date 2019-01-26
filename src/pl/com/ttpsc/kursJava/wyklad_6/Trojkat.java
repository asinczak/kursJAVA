package pl.com.ttpsc.kursJava.wyklad_6;

public class Trojkat extends Figura {

    int wysokość;

    public Trojkat (int dlBokuA, int wysokość) {
        super();
        this.wysokość = wysokość;
        this.dlBokuA = dlBokuA;
    }

    double obliczPoleFigury () {
        double poleFigury = 0.5 * dlBokuA * wysokość;
        return poleFigury;
    }

}
