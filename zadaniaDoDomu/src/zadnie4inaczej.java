public class zadnie4inaczej {
    public static void main(String[] args) {

        int tablica [] = new int [15];

        tablica [0] = 5;
        tablica [1] = 3;
        tablica [2] = 2;
        tablica [3] = 1;
        tablica [4] = 10;
        tablica [5] = 4;
        tablica [6] = 2;
        tablica [7] = 9;
        tablica [8] = 5;
        tablica [9] = 6;
        tablica [10] = 3;
        tablica [11] = 8;
        tablica [12] = 2;
        tablica [13] = 5;
        tablica [14] = 1;





        for (int i = 1; i  <= 10; i++) {
            int wynik = 0;
            for (int j = 0; j < tablica.length; j++) {

                if (i == tablica [j]) {
                    wynik++;
                }
            }

            System.out.println(i + " : " + wynik + " razy ");

        }



    }
}
