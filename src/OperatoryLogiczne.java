public class OperatoryLogiczne {

    public static void main(String[] args) {


        boolean wynik = true & false;
        System.out.println("true and true = " + wynik);

        wynik = true & true;
        System.out.println("true and true = " + wynik);

        wynik = true | false;
        System.out.println("true or false = " + wynik);

        wynik = true ^ true;
        System.out.println("true XOR true = " + wynik);

        wynik = true ^ false;
        System.out.println("true XOR false = " + wynik);

        wynik = !true;
        System.out.println("NOT true = " + wynik);

        wynik = !false;
        System.out.println("NOT false = " + wynik);


    }

}
