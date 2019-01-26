package pl.com.ttpsc.kursJava.wyklad_6;

public class TestFigur {

    public static void main(String[] args) {

        Kwadrat kwadrat1 = new Kwadrat(10);
        Kwadrat kwadrat2 = new Kwadrat(17);
        Trapez trapez1 = new Trapez(5,7,15);
        Trapez trapez2 = new Trapez(4,6,12);
        Trojkat trojkat1 = new Trojkat(5,9);
        Trojkat trojkat2 = new Trojkat(8,15);

        System.out.println("Pole kwadrat1: " + kwadrat1.obliczPoleFigury());
        System.out.println("Pole kwadrat2: " + kwadrat2.obliczPoleFigury());
        System.out.println("Pole trazpez1: " + trapez1.obliczPoleFigury());
        System.out.println("Pole trazpez2: " + trapez2.obliczPoleFigury());
        System.out.println("Pole trojkat1: " + trojkat1.obliczPoleFigury());
        System.out.println("Pole trojkat1: " + trojkat1.obliczPoleFigury());

        System.out.println("Utworzono " + Figura.licznikObiektow + " obiektów");
    }
}
