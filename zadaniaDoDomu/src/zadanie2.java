public class zadanie2 {
    public static void main(String[] args) {

        //Napisz program służący do konwersji wartości temperatury podanej w stopniach Celsjusza
        // na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)

        float stopnieCelsjusza = 10f;
        float stopnieFarenhajta;
        stopnieFarenhajta = (float) (1.8 * stopnieCelsjusza +32.0);

        System.out.println(stopnieCelsjusza + " stopni Celsjusza = " + stopnieFarenhajta + " stopni Farenhajta" );



    }
}
