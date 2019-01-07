public class zadaniaMoje8 {
    public static void main(String[] args) {

        //Przy użyciu pętli i tablic przechowujących liczby całkowite zaprezentuj poniższą treść:
        //
        //tab[0,0] = 0;
        //tab[0,1] = 1;
        //tab[0,2] = 2;
        //tab[1,0] = 3;
        //tab[1,1] = 4;
        //tab[1,2] = 5;
        //Wykorzystuj przy tym własność length.

        int tab [] [] = new int [2] [3];
        int licznik = 0;
       // int j = 0;

        for (int i = 0; i< tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab [i] [j] = licznik++;
                System.out.println ("tab["+i+","+j+"]= " + tab[i][j]);
            }

        }

        //odwrócenie tablicy


        int tab2 [] [] = new int [2][3];
        int k = 0;
        int z = 0;

        for (int i = tab.length -1; i>0; i--) {
            for (int j = tab[i].length -1; j > 0; j--) {

                tab2[k][z] = tab[i][j];
                k++;
                z++;

            }
        }


        for (int i = 0; i< tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {

                System.out.println ("tab["+i+","+j+"]= " + tab2[i] [j]);
            }

            }

    }
}
