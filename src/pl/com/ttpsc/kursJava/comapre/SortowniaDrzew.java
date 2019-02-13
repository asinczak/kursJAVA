package pl.com.ttpsc.kursJava.comapre;

import java.util.Comparator;

public class SortowniaDrzew implements Comparator<Drzewo> {

    @Override
    public int compare(Drzewo o1, Drzewo o2) {
        if (o1.srednica == o2.srednica) {
            //jesli srednice sa te same to porownujemy wiek, po prostu odejmujac od wieku pierwszego drzewa wiek drzewa drugiego
            // ten sam pomysl jak w przypadku porownywania drzew po srednicach
            return o1.wiek - o2.wiek;
        } else {
            return o1.srednica - o2.srednica;
        }
    }
}
