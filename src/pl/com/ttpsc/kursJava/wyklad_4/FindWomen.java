package pl.com.ttpsc.kursJava.wyklad_4;

public class FindWomen {

    /**
     * metoda wyszukujaca imie kobiece
     * @param imiona
     * @return
     */
    int findWomen (String imiona []) {

        int wynik = 0;

        for (int i = 0; i < imiona.length; i++) {

            boolean checking = imiona[i].endsWith("a" );
            if (checking) {

                wynik++;
            }

        }

        return wynik;

    }

}
