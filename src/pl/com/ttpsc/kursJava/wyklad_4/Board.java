package pl.com.ttpsc.kursJava.wyklad_4;


import java.util.Random;

public class Board {

    public static void main(String[] args) {

        Random r = new Random();
        Colour plansza [][] = new Colour[5][5];

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza [i].length; j++) {
                int losowanieLiczby = r.nextInt(3);
                plansza [i] [j] = new Colour(losowanieLiczby);

                if (losowanieLiczby == 0){
                    plansza [i] [j].kolor = 'c';
                }
                if (losowanieLiczby == 1) {
                    plansza [i] [j].kolor = 'z';
                }
                if (losowanieLiczby == 2) {
                    plansza [i] [j].kolor = 'n';
                }

                System.out.print(plansza [i] [j].kolor + " ");
            }
            System.out.println(" ");
        }




    }
}