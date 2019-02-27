package pl.com.ttpsc.kursJava.Exercises;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {

        Random random = new Random();
        int diagonal = random.nextInt(2);

        int x = 10 + (int) (Math.random() * ((20 - 10) +1));
        int tab[][] = new int[x][x];


        for (int i = 0; i < tab.length; i++) {

            for (int y = 0; y<tab.length; y++) {
                int number = -100 + (int) (Math.random() * ((100 - (-100)) +1));
                tab[i] [y] = number;
                tab [i] [i] = diagonal;
                System.out.print(tab [i] [y] +"\t");
            }
            System.out.println();
        }
        System.out.println("tab.lenhth : " +tab.length);

    }

}