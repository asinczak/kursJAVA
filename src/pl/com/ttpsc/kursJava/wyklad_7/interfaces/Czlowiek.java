package pl.com.ttpsc.kursJava.wyklad_7.interfaces;

public interface Czlowiek extends Zwierze {

    default void poruszaj() {
        System.out.println("Ide");
    }

   static void powiedzZdzanie(String zdanie) {
       System.out.println(zdanie);
   }

}
