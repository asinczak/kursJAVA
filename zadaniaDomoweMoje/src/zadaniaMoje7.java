public class zadaniaMoje7 {
    public static void main(String[] args) {

        //napisz program, który sumuje liczby od 1 do n, gdzie n<=46340

        int wynik = 0;

        for (int i = 0; i <= 46340; i++) {
            wynik = wynik + i;
        }
        System.out.println(wynik);


        //napisz program, który sumuje liczby od 1 do n, gdzie n<=1000*1000*1000

        long wynik2 = 0;

        for (long i = 0; i <= (1000*1000*1000); i++) {
            wynik2 = wynik2 + i;
        }
        System.out.println(wynik2);


    }
}
