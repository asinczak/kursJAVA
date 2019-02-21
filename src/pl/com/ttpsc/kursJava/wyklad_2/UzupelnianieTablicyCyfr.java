public class UzupelnianieTablicyCyfr {

    //   args: [8]
    // indeks:  0
    public static void main(String[] args) {

        String dlugoscTablicyNapis = args[0];

        System.out.println("Dlugosc tablicy = " + dlugoscTablicyNapis);

        Integer dlugoscTablicyLiczba = Integer.valueOf(dlugoscTablicyNapis);

        int[] tablica = new int[dlugoscTablicyLiczba];

        int wartosc = 1;
        int licznik = 0;

        //petla do uzupelniania wartosciami tablicy
        while (licznik < dlugoscTablicyLiczba) {
            tablica[licznik] = wartosc;
            wartosc++;
            licznik++;
        }

        //petla do odczytu wartosci z tablicy
        int indeks = 0;
        while (indeks < dlugoscTablicyLiczba) {
            int elemetTablicy = tablica[indeks];
            System.out.println(elemetTablicy);
            indeks++;
        }





    }


}
