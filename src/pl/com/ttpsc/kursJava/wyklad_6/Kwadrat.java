package pl.com.ttpsc.kursJava.wyklad_6;

public class Kwadrat extends Figura {

    public Kwadrat (int dlBokuA){
        super ();
        this.dlBokuA = dlBokuA;
    }

     double obliczPoleFigury () {
        int poleFigury = dlBokuA * dlBokuA;
        return poleFigury;
    }
}
