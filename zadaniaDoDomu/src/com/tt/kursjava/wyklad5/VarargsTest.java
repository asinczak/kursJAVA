package com.tt.kursjava.wyklad5;

public class VarargsTest {

//    public  static String dodaj(String s, int x) {
//        return s + x;
//    }



    public static int dodaj(int x, int y) {
        return x + y;
    }

    public static int dodaj(int x, int y, int z) {
        return x + y + z;
    }

    //TODO do przejrzenia
    public static int dodaj(int... x) {
        int wynik = 0;

        for (int i = 0; i < x.length; i++) {
            wynik += x[i];
        }

        return wynik;
    }

    public static int dodaj(boolean ... b) {
        return 0;
    }

    public static void main(String[] args) {

        dodaj(1,2);
        dodaj(1,2,3);

        //metoday z parametrem var-args moga przyjmowac 0 lub wiele elementow
        int wynik = dodaj(1,2,3,4,5);
        System.out.println(wynik);

        //kompilator nie wie ktora metode ma wywolac czy ta przyjmujaca int czy boolean, obie moga
        //byc wywolane bez przekazania argumentu, jak nizej, wtedy kompilator nie ma pojecia, ktora wybrac
//        dodaj();
//
    }

}
