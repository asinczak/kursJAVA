package pl.com.ttpsc.kursJava.wyklad_7.interfaces;

public class Lampart implements Kot, Zwierze {

    @Override
    public void jedz() {
        System.out.println("Lampart je");
    }

    @Override
    public void poluj() {
        System.out.println("Lampart poluje");
    }
}
