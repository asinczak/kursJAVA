public class zadaniaMoje5 {
    public static void main(String[] args) {

        //Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
        //Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).

        String dlTablicy = args [0];
        int wysokoscChoinki = Integer.valueOf(dlTablicy);


        for (int i = 1; i <= wysokoscChoinki; i++) {
            for (int j = wysokoscChoinki - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int z = 1; z < (i*2); z++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
