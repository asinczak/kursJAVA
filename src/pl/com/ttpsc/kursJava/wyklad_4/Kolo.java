package pl.com.ttpsc.kursJava.wyklad_4;

import static java.lang.Math.*;

public class Kolo {

    double pole (int promien) {
        double poleKola = Math.PI * pow(promien, 2);
        return poleKola;
    }


    double obwod (int promien) {
        int srednicaKola = 2 * promien;
        double obwodKola = Math.PI * srednicaKola;
        return obwodKola;
    }


}
