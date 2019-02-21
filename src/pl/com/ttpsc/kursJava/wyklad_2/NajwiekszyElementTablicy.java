public class NajwiekszyElementTablicy {

    public static void main(String[] args) {
        int[] maxTalica = {1, 2, 3, 4, 5, 200, 7, 8, 9, 100, 10, 11};


        //wypisuje elementy z tablicy mniejsz od 4 i wieksze od 40
        int indeksMaxTablicy = 0;

        // maxTalica.length - taki zapis zwraca nam dlugosc tablicy (maxTablica to jest nazwa a ".length" zwraca nam jej dlugosc)
        while (indeksMaxTablicy < maxTalica.length) {

            //int elementTablicy = tablicaLiczb[indeks] - wzor - taki zapis powoduje pobranie z tablicy (tablicaLiczb) elementu
            //pod indeksem "indeks" i przypisanie go do zmiennej "elementTablicy"
            int kolejnyElementTablicy = maxTalica[indeksMaxTablicy];

            if (kolejnyElementTablicy < 4 || kolejnyElementTablicy > 40) {
                System.out.println("Element " + kolejnyElementTablicy + " jest mniejszy od 4 lub wiekszy od 40");
            }

            indeksMaxTablicy++;
        }
    }
}
