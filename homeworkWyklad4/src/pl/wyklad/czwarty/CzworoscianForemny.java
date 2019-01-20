package pl.wyklad.czwarty;

public class CzworoscianForemny {

    double objetosc (double x) {
        double objetoscFigury = (Math.pow(x,3) * Math.sqrt(2)) / 12;
        return objetoscFigury;
    }


    int pole (int y) {
        int poleFigury = (int) (Math.pow(y,2) * Math.sqrt(3));
        return poleFigury;
    }


    int wysokosc (int z) {
        int wysokoscFigury = (int) ((Math.sqrt(6) / 3) * z);
        return wysokoscFigury;
    }


    boolean czyCzworoscianForemny (double bokA, double bokB, double bokC) {
        bokA = bokB = bokC;
        return true;
    }



}
