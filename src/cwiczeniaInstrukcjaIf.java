public class cwiczeniaInstrukcjaIf {

    public static void main(String[] args) {

        int liczba = -2;

        if (liczba % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nieparzysta");
        }


        if (liczba > 10) {
            System.out.println(liczba + " jest większa od 10");
        } else if (liczba < 10 && liczba >= 0){
            System.out.println(liczba + " jest dodatnia większa lub równa o");
        } else {
            System.out.println(liczba + " jest ujemna");
        }




    }
}
