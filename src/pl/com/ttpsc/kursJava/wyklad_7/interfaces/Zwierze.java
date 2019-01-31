package pl.com.ttpsc.kursJava.wyklad_7.interfaces;

public interface Zwierze {

    default void jedz() {
        System.out.println("Zwierze je");
    }

}
