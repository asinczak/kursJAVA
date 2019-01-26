package pl.com.ttpsc.kursJava.wyklad_5;

//Program przyjmuje ciąg liczb (dowolnej długości), jego zadaniem jest posortowanie liczb w porządku rosnącym np.:
//a.      Dla ciągu 5, 3, 7, 10, 2, 11, 100, 76, 15 ma zwrócić 2, 3, 5, 7, 10, 11, 15, 76, 100
//b.      Sprawdź sortowanie bąbelkowe


//import java.util.Collections;

public class Zadanie3 {

    public static void main(String[] args) {

        //  Collections.sort(liczby);

        int tablica [] = new int[args.length];
        for (int i = 0; i < args.length; i++){
            tablica [i] = Integer.valueOf(args [i]);
        }

        int pomocnicza = 0;

        for (int i = 0; i < args.length-1; i++){
            for (int j = 0; j < args.length-1; j++){

                if (tablica [j] > tablica [j + 1]){
                    pomocnicza = tablica [j];
                    tablica [j] = tablica [j +1];
                    tablica [j + 1] = pomocnicza;
                }
            }
        }
        for (int i : tablica){
            System.out.println("metoda bąbelkowa: " + i);
        }

    }
}