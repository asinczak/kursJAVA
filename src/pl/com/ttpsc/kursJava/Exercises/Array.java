package pl.com.ttpsc.kursJava.Exercises;

import java.util.Random;

public class Array {

    int tab[][];

        public void createArray () {
            Random random = new Random();

            int x = 10 + (int) (Math.random() * ((20 - 10) + 1));
            tab = new int[x][x];
            int i = 0;
            int y = 0;

            for (i = 0; i < tab.length; i++) {
                for (y = 0; y < tab.length; y++) {
                    int number = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
                    tab[i][y] = number;
                }
            }

            for (i = 0; i<tab.length; i++) {
                tab [i] [i] = drawingNumber();
            }


                for(y = 0; y <tab.length; y++){
                    tab [tab.length- y-1] [y] = drawingNumber();
            }

            for (i = 0; i<tab.length; i++) {
                for (y = 0; y < tab.length; y++) {
                    System.out.print(tab[i][y] + "\t");
                }
                System.out.println();
            }
            System.out.println("tab.length : " + tab.length);
        }

        public int drawingNumber () {
            Random random = new Random();

            int numberOfi = random.nextInt(tab.length);
            if (numberOfi % 2 == 0){
                return 1;
            } else {
                return -1;
            }
        }

        public void findMaxNumbers () {
             int firstMax = 0;
             int secondMax = 0;

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
            if (tab[i][j] > firstMax) {
                secondMax = firstMax;
                firstMax = tab[i][j];
            }
        }
    }
            System.out.println("First max number : " + firstMax + "\n" +
            "Second max number : " + secondMax);
}

    public void findSums () {
            int sumof_i = 0;
            int sumOf_j = 0;

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                if (i % 2 == 0) {
                    sumof_i += tab[i][j];
                }
                if (j % 2 == 1) {
                    sumOf_j += tab[i][j];
                }
            }
        }
        System.out.println("Sum of rows : Sum of column" + "\n" +
                sumof_i + " : " + sumOf_j);
    }


    public void findCellars () {
        int counter = 0;

        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j<tab.length; j++) {
                int result = i * j;
                if (tab [i] [j] < result) {
                    counter++;
                }
            }
        }
        System.out.println("The number of cellars :" +counter);
    }

    public static void main(String[] args) {
        Array array = new Array();

        array.createArray();
        array.findMaxNumbers();
        array.findSums();
        array.findCellars();

    }
}