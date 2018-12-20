public class Test2 {

    public static void main(String[] args) {

        byte byte1 = 9;
        short short1 = 1000;
        int int1 = 9999;
        long long1 = 10000000;

        //byte wynik = byte1 + 1;
        //byte wynik = (byte) (byte1 + 1);
        // byte1 + 1 -> domyslny typ dla liczb calkowitych w Javie to int
        // przy obliczniu wynik jest zamieniany na int

       //konwersja rozszerzajaca, w dzialaniu byla urzyta zmienna typu long, także wynik dzdialania bedzie też
        //typu long. Wynik ten chcemy przypisac do zmiennej typu int (ktora jest mniejsza), komilaor
        //na to nie pozwoli z obawy o utratę informacji.

        int wynikDzialania = int1 + long1;

        //Jesli chcemy jednak przypisac wynik takiego dzialania do zmiennej typu int to musimy
        //jawnie to kompilatorowi powiedziec. Uzywa sie do tego rzutowania - mowimy wtedy ze
        //wiemy co robimy i jestesmy swiadomi zagrozenia utraty informacji

        int wynikDzialaniaZRzutowaniem =  (int) (int1 + long1);


        //mnozenie
        int m1 = 2;
        int m2 = 3;

        //wartosc zmiennej mozna zmienic w kazdej chwili w programie
        m1 = 6;
        m1 = 9;
        m1 = 10;

        int wynikMnozenia = m1 * m2;

        //dzielenie
        int d1 = 10;
        int d2 = 2;
        int wynikDzielenia = d1 / d2;

        //odejmowanie
        int odj1 = 11;
        int odj2 = 2;
        int wynikOdejmowania = odj1 - odj2;


    }

}
