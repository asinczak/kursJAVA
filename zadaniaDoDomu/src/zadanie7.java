public class zadanie7 {
    public static void main(String[] args) {


        //Napisz program który tworzy najpierw tablice wielowymiarową o wymiarach[4][4]
        // liczb całkowitych dodatnich a następnie przekształca tę tablicę na wartości ujemne:


        int tablica [] [] = new int [4] [4];

        tablica [0] [0] = 5;
        tablica [0] [1] = 3;
        tablica [0] [2] = 10;
        tablica [0] [3] = 9;

        tablica [1] [0] = 15;
        tablica [1] [1] = 8;
        tablica [1] [2] = 51;
        tablica [1] [3] = 2;

        tablica [2] [0] = 25;
        tablica [2] [1] = 2;
        tablica [2] [2] = 89;
        tablica [2] [3] = 85;

        tablica [3] [0] = 45;
        tablica [3] [1] = 20;
        tablica [3] [2] = 1;
        tablica [3] [3] = 9;




        for (int i = 0; i < tablica.length; i++) {

            for (int j = 0; j < tablica[i].length; j++) {

             tablica [i] [j] = tablica [i] [j] * (-1);

                System.out.println("tablica [" + i + "] [" + j + "] = " + tablica[i][j]);

            }
        }




    }
}
