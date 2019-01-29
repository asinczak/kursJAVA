package pl.com.ttpsc.kursJava.wyklad_7.interfaces;

public class KotDomowy implements Kot, Zwierze {

    @Override
    public void jedz() {
        System.out.println("Kot domowy je");
    }

    @Override
    public void poluj() {
        System.out.println("Kot domowy poluje");
    }

    public void lenSie() {
        System.out.println("Kot domowy sie leni");
    }
}
