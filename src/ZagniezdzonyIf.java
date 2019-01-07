public class ZagniezdzonyIf {
    public static void main(String[] args) {

        int wiekPacjenta = 19;
        int wiekPelnoletni = 18;
        int wiekOpiekuna = 50;

        boolean pacjentMaPolise = false;
        boolean opiekunMaPolise = true;

        //pacjent jest pelnoletni

        if (wiekPacjenta > wiekPelnoletni) {
            System.out.println("Pacjent jest pelnoletni");

            if (pacjentMaPolise) {
                System.out.println("Pacjent ma polise");
            } else {
                System.out.println("Pacjent nie ma polisy");
            }

            if (wiekOpiekuna > wiekPelnoletni) {
                System.out.println("Opiekun jest pelnoletni");
            }

            if (opiekunMaPolise) {
                System.out.println("Opiekun ma polise");
            } else {
                System.out.println("Opikeun nie ma polisy");
            }

        } // koniec bloku pacjent jest pelnoletni

        else {
            //obsluga pacjenta niepelnoletniego
            System.out.println("pacjent nie jest pelnoletni");

        } //koniec bloku



    }
}
