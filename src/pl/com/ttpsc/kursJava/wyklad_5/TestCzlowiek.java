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

            System.out.println(tablicaZuczestnikami [i].waga);
            tablicaZuczestnikami [i].odchudz();
            tablicaZuczestnikami [i].odchudz();
            tablicaZuczestnikami [i].odchudz();
            tablicaZuczestnikami [i].rosnij();
            System.out.println("po odchudzaniu " + tablicaZuczestnikami [i].waga);
            System.out.println("teraz mam " + tablicaZuczestnikami [i].wzrost + " wzrostu");

            System.out.println("uczestnicy liczą " + tablicaZuczestnikami [i].czlowiekLiczy(tablicaZuczestnikami [i].waga, tablicaZuczestnikami [i].wzrost));


        }

    }
}