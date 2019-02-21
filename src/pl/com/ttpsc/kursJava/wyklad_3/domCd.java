import java.sql.SQLOutput;

public class domCd {
    public static void main(String[] args) {

        String name1 = "Bola";
        String name2 = "Olek";
        String name3 = "Basia";
        String name4 = "Tomek";
        String name5 = "Ola";


        if (name1 == "Kasia") {
            System.out.println("Cześć " + name1);
        } else if (name1 != "Kasia") {
            System.out.println("Nie znam Cię");
        }

        if (name3 == "Basia") {
            System.out.println("Cześć " + name3);
        } else if (name3 != "Basia") {
            System.out.println("Nie znam Cię");
        }

        if (name4 == "Tomek" & name5 == "Ola" ){
            System.out.println("Hej Wy!");
        } else if (name4 + name5 != "Tomek" + "Ola") {
            System.out.println("Nie znam Was!");
        }
    }
}
