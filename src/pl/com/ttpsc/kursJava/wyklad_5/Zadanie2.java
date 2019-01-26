package pl.com.ttpsc.kursJava.wyklad_5;

//Program przyjmuje listę liczb (dowolnej długości), jego zadaniem jest wypisanie pierwszej liczby w ciągu podzielnej
// przez 3 i 5, pętla ma nie sprawdzać kolejnych liczb np. dla ciągu 6, 4, 8, 3, 15, 90, 7; na ekranie powinno zostać
// wypisane 15, liczby 90 i 7 nie zostaną sprawdzone
//a.      Instrukcja break

public class Zadanie2 {

    public static void main(String[] args) {

        int tablica [] = new int[args.length];
        int i = 0;

        for (i = 0; i < args.length; i++) {
            tablica [i] = Integer.valueOf(args [i]);
            if (tablica [i] % 3 == 0 & tablica [i] % 5 == 0) {
                break;
            }
        }
        System.out.println(tablica [i]);


    }

}
