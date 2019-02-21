public class zadaniaDoDomu {
    public static void main(String[] args) {

        // Napisz program który dla podanej liczby całkowitej wyświetla jej dzielniki.
        // Przykład dla np. liczby 21 dzielniki to: 1, 3, 7, 21

        String tablicaNapis = args [0];
        Integer liczbaCalkowita = Integer.valueOf(tablicaNapis);

        int dzielnik = 0;
        int i;



        for (i = 1; i <= liczbaCalkowita; i++) {


            if (liczbaCalkowita % i == 0) {


                System.out.println("Dzielniki " + liczbaCalkowita + " to: " + i);


            }


        }




}


}
