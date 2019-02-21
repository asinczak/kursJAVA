package pl.com.ttpsc.kursJava.wyklad_2.src;

public class CwiczeniaWyklad2 {
    public static void main(String[] args) {
        System.out.println("Hu hu ha!");

        int jakasLiczba = 200;
        byte byte1 = 2;
        int wynik = jakasLiczba + byte1;

        byte libcza1 = 5;
        byte liczba2 = 4;
        byte wynik1 = (byte) (libcza1 * liczba2);

        int liczba3 = 156656;
        long liczba4 = 258955661;
        int wynik2 = (int) (liczba4 - liczba3);

        float liczba5 = 5.897f;
        byte byte2 = 2;
        float wynik3 = liczba5 / byte2;

        byte liczbaDziewczynek = 15;
        byte liczbaChlopcow = 11;
        byte liczbaDzieci_w_Grupie = (byte) (liczbaDziewczynek + liczbaChlopcow);





        //Praca domowa

        //1.   Zadeklaruj i zainicjuj zmienne wszystkich typów prostych

        byte dlugoscStopy = 27;
        short dlugosc_trasy = 327;
        int predkoscSwiatla = 299792;
        long saldo_rach = 514798552;
        float szer_sciany = 10.25f;
        double dl_sciany = 20.45689527;
        char literaAlfabetu = 'c';
        boolean wynik10 = true;
        boolean wynik11 = false;

        //2. Użyj operatorów dodawania, mnożenia, odejmowania i dzielenia i przypisz wynik do zmiennej
        //Na tych samych typach liczbowych

        int cenaKleju = 1456;
        int cenaTapety = 5879;
        int lacznaKwota = cenaKleju + cenaTapety;

        byte szer_pokoju = 4;
        byte dl_pokoju = 6;
        byte powierzchnia_pokoju = (byte) (szer_pokoju + dl_pokoju);

        int liczbaJablek = 700;
        int zjedzoneJablka = 250;
        int niezjedzoneJablka = liczbaJablek - zjedzoneJablka;

        byte liczbaOsob = 10;
        byte liczbaAut = 2;
        byte liczbaOsob_w_Aucie = (byte) (liczbaOsob / liczbaAut);

        //Na różnych typach liczbowych

        int podstawowaWersjaAuta = 90850;
        byte cenaKolpakow = 100;
        float klimatyzacja = 5999.99f;
        char model = 'v';
        float cenaAuta = podstawowaWersjaAuta + cenaKolpakow + klimatyzacja;

        int pow_dzialki = 5000;
        byte pow_domu = 110;
        int pow_uzytkowa_dzialki = pow_dzialki - pow_domu;

        byte carSpeed = 90;
        int distance = 2000;
        byte hours = (byte) (distance / carSpeed);

        long a = 125489624;
        byte b = 24;
        int c = 1253;
        float d = 3.5689f;
        float e = a * b * c * d;

        // Zadeklaruj tablicę typu int, char i String
        // Spróbuj uzupełnić je wartościami i wypisać później na ekran


        String imiona [] = new String[5];
        imiona [0] = "Kasia";
        imiona [1] = "Bartek";
        imiona [2] = "Ola";
        imiona [3] = "Kuba";
        imiona [4] = "Jaś";

        System.out.println("Cześć " + imiona [3]);


        String zimoweMiesiace [] = {"grudzień", "styczeń", "luty"};


        short najlepszyWynik [] = new short[7];
        najlepszyWynik [0] = 145;
        najlepszyWynik [1] = 48;
        najlepszyWynik [2] = 479;
        najlepszyWynik [3] = 757;
        najlepszyWynik [4] = 258;
        najlepszyWynik [5] = 426;
        najlepszyWynik [6] = 657;

        System.out.println("Pokaż najlepszy wynik: " + najlepszyWynik [3]);

        short liczby [] = {1,2,3,4,5,6};



        char litera [] = new char [6];
        litera [0] = 'a';
        litera [1] = 'g';
        litera [2] = 'p';
        litera [3] = 'e';
        litera [4] = 'r';
        litera [5] = 'd';

        System.out.println("Wskaż samogłoski: " + litera [0] + litera [3]);


    }
}
