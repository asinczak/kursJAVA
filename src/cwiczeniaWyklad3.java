public class cwiczeniaWyklad3 {
    public static void main(String[] args) {

        int a = 55;
        int c = 50;
        float d = 5.25f;
        int e = 5;

        boolean wynik1 = a < c;
        boolean wynik2 = c > a;

        System.out.println("Pokaż " + wynik1);
        System.out.println("Pokaż " + wynik2);

        boolean wynik3 = d > e;
        System.out.println("Pokaż " + wynik3);

        boolean wynik4 = d == e;
        System.out.println("Pokaż " + wynik4);

        boolean wynik5 = a != c;
        System.out.println("Pokaż " + wynik5);


        if (d>e) {
            System.out.println("Wyślij email");
        } else {
            System.out.println("Podlej kwiaty");
        }



        int osobaPelnoletnia = 18;
        int pacjent1 = 30;
        int pacjent2 = 10;

        if (pacjent1 > osobaPelnoletnia & pacjent2 < osobaPelnoletnia) {
            System.out.println("Zapisz się do lekarza");
        }


        int homeTemperature = 20;
        int airTemperature = 5;

        if (homeTemperature <= 21 | airTemperature <= 0) {
            System.out.println("Włącz ogrzewanie");
        }

        homeTemperature = 25;
        airTemperature = 20;

        if (homeTemperature > 21 | airTemperature > 25) {
            System.out.println("Wlącz klimatyzacje");
        }


        if (homeTemperature > 28) {
            System.out.println("Włącz klimatyzacje");
        } else {
            System.out.println("spr temp za 5 min");
        }


    }
}

