package pl.com.ttpsc.kursJava.wyklad_7.interfaces;

public interface Kot {

    default void jedz() {
        System.out.println("Kot je");
    }

    void poluj();

}
