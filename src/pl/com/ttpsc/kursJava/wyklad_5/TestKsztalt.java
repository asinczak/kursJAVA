package pl.com.ttpsc.kursJava.wyklad_5;

import java.util.Random;

public class TestKsztalt {

    public static void main(String[] args) {

        String parametr = args [0];
        int liczbaObiektow = Integer.valueOf(parametr);

        String tablicaKsztalty [] = {"kolo", "prostokat", "trojkat"};
        Random r = new Random();

           Ksztalt tablicaObiekty [] = new Ksztalt[liczbaObiektow];
           int i =0;
           for (i = 0; i< tablicaObiekty.length; i++){
               tablicaObiekty [i] = new Ksztalt(tablicaKsztalty[r.nextInt(3)]);

               System.out.println(tablicaObiekty [i].ksztalt);
           }

        System.out.println("Liczba stworzonych obiektów: " + Ksztalt.zliczanieObiektow());


    }
}
