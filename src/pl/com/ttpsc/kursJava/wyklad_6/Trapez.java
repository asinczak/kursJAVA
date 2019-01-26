package pl.com.ttpsc.kursJava.wyklad_6;

public class Trapez extends Figura {

    int wysoksc;
    int dlBokuB;

    public Trapez (int dlBokuA, int dlBokuB, int wysoksc) {
        super();
        this.wysoksc = wysoksc;
        this.dlBokuB = dlBokuB;
        this.dlBokuA = dlBokuA;
    }

    double obliczPoleFigury (){
        double poleFigury = 0.5 * (dlBokuA + dlBokuB) * wysoksc;
        return poleFigury;
    }
}
