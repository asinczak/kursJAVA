public class cwiczeniaWyklad3dom {
    public static void main(String[] args) {

     int month = 9;


     if (month == 12 || month == 1  || month == 2) {
         System.out.println("Miesiąc " + month + " należy do pory roku zima" );
     }

     if (month == 3 | month ==4 | month == 5) {
         System.out.println("Miesiąc " + month + " należy do pory roku wiosna");
     }

     if (month == 6 | month == 7 | month == 8) {
         System.out.println("Miesiąc " + month + " należy do pory roku lato");
     }

     if (month == 9 | month == 10 | month == 11) {
         System.out.println("Miesiąc "+ month + " należy do pory roku jesień");
     }
    }
}
