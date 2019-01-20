public class zadanie6 {
    public static void main(String[] args) {

        //Program przyjmuje parametr, który reprezentuje wiek.
        //Wiek powinien być w programie przypisany do zmiennej typu int.
        //Jeśli podany wiek jest mniejszy od 18, program powinien wypisać wiadomość „Jesteś niepełnoletni”.
        //Jeśli podany wiek jest większy lub równy 18, program powinien wypisać „Jesteś pełnoletni”.
        //Dodatkowo jeśli podany wiek jest powyżej 35, program powinien wypisać „Możesz kandydować na prezydenta”.

        String tablicaNapis = args [0];
        Integer wiek = Integer.valueOf(tablicaNapis);

        if (wiek < 18) {
            System.out.println("Jestes niepełnoletni");

        } else if(wiek >= 18){
                System.out.println("Jesteś pełnoletni");

        } if (wiek > 35) {
                System.out.println("Możesz kandydować na prezydenta");
            }


    }
}
