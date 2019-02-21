import java.util.Random;

public class zadanie4 {
    public static void main(String[] args) {

        // Napisz program który utworzy tablicę 15 liczb całkowitych
        // z przedziału od 1 do 10 a następnie wypisze na ekranie ile razy każda z liczb
        // z tego przedziału powtarza się w tablicy

        Random r = new Random();
        int tablica [] = new int [15];


        for (int liczbaCalkowita = 0; liczbaCalkowita<15; liczbaCalkowita++ ) {
            tablica[liczbaCalkowita] = r.nextInt (10) + 1;


            System.out.println(tablica[liczbaCalkowita]);
            }

        //int liczbaCalkowita;
        int wartość = 1;
        int suma = 0;



        for (int i =0; i < tablica.length; i++){

            if (wartość == tablica[i]){

            suma++;
          wartość++;
            }

        }

        if (suma ==1) {
            System.out.println( wartość + " występuje " + suma + " raz");
        }
        else {
            System.out.println(wartość + " występuje " + suma + " razy");

        }





    }
}
