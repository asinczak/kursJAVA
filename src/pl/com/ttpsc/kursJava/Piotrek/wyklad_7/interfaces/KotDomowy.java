package pl.com.ttpsc.kursJava.Piotrek.wyklad_7.interfaces;

public class KotDomowy implements Kot, Zwierze {

    /*
    W przypadku gdy dwa interfejsy maja metody defaoult o takiej samej sygnaturze,
    klasa ktora je implementuje musi nadpisac te metode i zdecydowac jaka ma byc jej impelementacja
     */
    @Override
    public void jedz() {
        //wywoanie metody default z interfejsu w klasie implementujacej ten interfejs
//        Kot.super.jedz();
        System.out.println("Kot mruczy");
    }

    @Override
    public void poluj() {
        System.out.println("Kot domowy poluje");
    }

    public void lenSie() {
        System.out.println("Kot domowy sie leni");
    }
}
