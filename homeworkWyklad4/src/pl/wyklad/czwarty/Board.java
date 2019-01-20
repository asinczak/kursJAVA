package pl.wyklad.czwarty;


import java.util.Random;

public class Board {

    public static void main(String[] args) {

        Colour kolor = new Colour('c', 'z', 'n');

        Random r = new Random();
        char plansza[][] = new char [5][5];

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza [i].length; j++) {
                plansza [i] [j] = (char) r.nextInt(3);
                if (plansza [i] [j] == 0) {
                    plansza [i] [j] = kolor.czerwony;
                }
                if (plansza [i] [j] == 1) {
                    plansza [i] [j] = kolor.zielony;
                }
                if (plansza [i] [j] == 2) {
                    plansza [i] [j] = kolor.niebieski;
                }


                System.out.print(plansza [i] [j] + " ");
            }
            System.out.println(" ");
        }




    }
}