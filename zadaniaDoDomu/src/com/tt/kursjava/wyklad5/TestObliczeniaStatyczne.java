package com.tt.kursjava.wyklad5;

public class TestObliczeniaStatyczne {



    public static void main(String[] args) {

        //nie musielismy tworzyc zadnego obiektu klasy com.tt.kursjava.wyklad5.Obliczenia a juz mozemy
        //uzywac zmiennej licznik. Statyczne zmienne naleza do klasy daltego nie potrzebujemy
        //zadnej instacji tej klasy (obiektu) zeby moc z nich skorzystac
        Obliczenia.licznik = 2;

        //metode statyczna mozemy wywolac nie posiadajc zadnego obiekty danej klasy
        //wywolujemy ja na rzecz klasy
        Obliczenia.przedstawSieStatycznie();
        int obj = Obliczenia.obliczObjetoscStatic(1,2,3);
        System.out.println("Objectosc obliczona w metodzie statycznej = " + obj);

        //metod niestatycznych nie mozna wywolac na rzecz klasy, takie metody
        //potrzebuja obiketu
        //com.tt.kursjava.wyklad5.Obliczenia.obliczObjetosc(2,3,4);

        Obliczenia s1 = new Obliczenia();
        //metode przedstawSie (nie statyczna) mozemy wywolac tylko wtedy, gdy posiadamy
        //konkrenty obiekt
        s1.przedstawSie();

        int obj1 = s1.obliczObjetosc(1,2,3);
        System.out.println("Objectosc obliczona z metody niestatycznej= " + obj1);

        Obliczenia s2 = new Obliczenia();

//        com.tt.kursjava.wyklad5.Obliczenia.licznik = 9;
//        System.out.println(com.tt.kursjava.wyklad5.Obliczenia.licznik);
//
//        System.out.println("S1.zmienna = " + s1.zmienna);
//        System.out.println("S1.licznik = " + s1.licznik);
//        System.out.println("");
//        System.out.println("S2.zmienna = " + s2.zmienna);
//        System.out.println("S2.licznik = " + s2.licznik);


        //przyklad metod statycznych dostepnych na klasie Math (dostarczanej z JDK)
//        System.out.println(Math.sqrt(2));
//        System.out.println(Math.abs(-1));

    }
}

