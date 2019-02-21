public class ObjesciePetli {

    public static void main(String[] args) {


        int licznik = 0 ;

        System.out.println("Licznik na poczatku = " + licznik);

        //z licznikiem 0 nigdy nie wejdzie w petle bo nie spalnia on warunku -> zero nie jest mniejsze od zera
        while (licznik  < 0) {
            System.out.println("licznik = " + licznik);
            licznik++;
        }

        //jesli zmienimy licznik na -3 to juz warunek jest spelniony i moze wejsc do petli na pewno raz
        licznik = -3 ;

        System.out.println("Licznik na poczatku = " + licznik);

        while (licznik  < 0) {
            System.out.println("licznik = " + licznik);
            licznik++;
        }

        System.out.println("Koniec Programu");

    }
}
