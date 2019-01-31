package pl.com.ttpsc.kursJava.wyklad_5;

import java.util.Random;

public class TestCzlowiek {
    public static void main(String[] args) {


        Czlowiek czlowiek1 = new Czlowiek(20, 170, 70, "man");
        System.out.println(czlowiek1.waga);
      czlowiek1.odchudz();
        System.out.println(czlowiek1.waga);

        Random r = new Random();
        int wagaUczestnika = r.nextInt(100);
        String str = args [0];
        int liczbaUczestniow = Integer.valueOf(str);

        Czlowiek tablicaZuczestnikami [] = new Czlowiek[liczbaUczestniow];

        for (int i = 0; i < tablicaZuczestnikami.length; i++) {
            tablicaZuczestnikami [i] = new Czlowiek(20,170, r.nextInt(100), "man");

            Czlowiek czlowiek = tablicaZuczestnikami[i];
            System.out.println(czlowiek.waga);
            czlowiek.odchudz();
            czlowiek.odchudz();
            czlowiek.odchudz();
            czlowiek.rosnij();
            System.out.println("po odchudzaniu " + czlowiek.waga);
            System.out.println("teraz mam " + czlowiek.wzrost + " wzrostu");

            System.out.println("uczestnicy liczą " + czlowiek.czlowiekLiczy(czlowiek.waga, czlowiek.wzrost));


        }

    }
}