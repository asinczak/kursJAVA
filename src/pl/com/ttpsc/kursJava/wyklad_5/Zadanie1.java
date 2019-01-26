package pl.com.ttpsc.kursJava.wyklad_5;

//Program przyjmuje listę liczb (dowolnej długości) i je sumuje. Dodatkowo z sumowania wyłączone są liczby podzielne
// przez 3 i 7 np.:
//a.      Dla ciągu 2, 4, 6, 8, 10, 14, 15, 17, 20 , 28, 30 – z sumowania wyłączone będą liczby 6, 14, 15, 28 i 30
//b.      Użyj instrukcji continue do pomijania liczb

public class Zadanie1 {

   boolean dzieleniePrzez3 (int x) {
       System.out.print("Sprawdzam 3");
       return x % 3 == 0;
   }

        boolean dzieleniePrzez7 (int y) {

            System.out.println("Sprawdzam 7");
       return y % 7 == 0 ;
    }



    public static void main(String[] args) {

        Zadanie1 zad = new Zadanie1();


        int suma = 0;
        for (int i = 0; i <args.length; i++) {
            int wartosc = Integer.valueOf(args [i]);

            System.out.println(wartosc);
                if (zad.dzieleniePrzez3(wartosc) || zad.dzieleniePrzez7(wartosc)) {
                    System.out.println("Pomijam");
                    continue;
                }
                suma += wartosc;
            }

        System.out.println("Wynik " + suma);
    }
}



