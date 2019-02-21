public class Tablica {

    public static void main(String[] args) {

        //tablice przechowuje zmienne tego samego typu

        // typ[] nazwaTablicy = new typ[rozmiarTablicy];


        short[] dniTygodnia = new short[7];

        //tablica posiada 7 elementow, wazne ze sa indeksowane od 0
        //przypisanie wartosci do tablicy
        dniTygodnia[0] = 9;

        //aby wyjac wartosc z tablicy musze takze urzyc indeksu aby odwolac sie do konkretnego elementu

        System.out.println("Tablica dniTygodnia ma pod indeksem 0 wartosc = " + dniTygodnia[0]);


        dniTygodnia[2] = 100;
        dniTygodnia[5] = 200;

        //indeks numer 7 to tak na prawde 8 miejsce w tablicy, nasza tablica moze miec tylko 7 elementow
        //takie przypisanie sie nie uda i zostanie podczas wykonywania programu wyrzucony blad
        dniTygodnia[7] = 900;

    }

}
