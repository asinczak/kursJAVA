package pl.com.ttpsc.kursJava.Piotrek.comapre;


import java.util.*;

public class TestSortowania {

    public static void main(String[] args) {

        Drzewo maleDrzewo = new Drzewo(10);
        Drzewo maleSrednieDrzewo = new Drzewo(20);
        Drzewo srednioMaleDrzewo = new Drzewo(30);
        Drzewo wiekszeDrzewo = new Drzewo(40);
        Drzewo wielkieDrzewo = new Drzewo(50);

        Drzewo wielkieStareDrzewo = new Drzewo(50, 10);
        Drzewo wielkieStarszeDrzewo = new Drzewo(50, 20);

        List<Drzewo> listaDrzew = new ArrayList<>();

        listaDrzew.add(wielkieDrzewo);
        listaDrzew.add(wiekszeDrzewo);
        listaDrzew.add(srednioMaleDrzewo);
        listaDrzew.add(maleSrednieDrzewo);
        listaDrzew.add(maleDrzewo);
        listaDrzew.add(wielkieStarszeDrzewo);
        listaDrzew.add(wielkieStareDrzewo);

        System.out.println(listaDrzew);

        //takie wykorzystanie metody sort korzysta z domyslnej implementacji porownywania zaimplementowanej w klasie Drzewo
        //klasa Drzewo implementuje interfejsc Comparable, ktory wymusza nadpisanie metody compateTo, ktora jest uzywana do porownywania obiektow
        Collections.sort(listaDrzew);

        System.out.println(listaDrzew);


        //przypadek uzycia wzorca strategii, tworzymy dodatkowa klasa implementujaca interfejs Comparator w celu
        //uzycia innej logiki porownywania obiektow. Domyslne porownywanie nie jest w tym momencie wykorzystywane

        SortowniaDrzew porownywarka = new SortowniaDrzew();
        Collections.sort(listaDrzew, porownywarka);

        System.out.println(listaDrzew);


    }

}
