public class zadanie5 {
    public static void main(String[] args) {

       // Napisać program który będzie posiadł zmienią typu int reprezentującą długość boku (x).
        // Program ma  rysować na ekranie (przy pomocy znaku 'o') trójkąt prostokątny, w którym
        // obydwie przyprostokątne są długości x.

        String tablicaNapis = args [0];
        Integer x = Integer.valueOf(tablicaNapis);


        for (int i = 0; i <= x; i++){

            for (int j = 0; j < i; j++) {

                System.out.print( "o");
            }
            System.out.println(" ");
        }


    }

}
