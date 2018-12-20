public class PodsumowanieCwiczenia {
    public static void main(String[] args) {

        // ZADANIE: Napisz program który nigdy nie wejdzie do pętli while


        int zmienna = 2;

        System.out.println("Początek programu");

        while (zmienna < 0) {
            System.out.println("Pokaż " + zmienna);
            zmienna++;
        }

        System.out.println("Koniec programu");

    }

}

