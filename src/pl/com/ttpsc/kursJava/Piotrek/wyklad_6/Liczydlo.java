package pl.com.ttpsc.kursJava.Piotrek.wyklad_6;


class Liczydlo {

    public void oblicz(double a) {
        System.out.println("licze w metodzie przyjmujacej jeden parametr double");
    }


    //jesli ta metoda bedzie odkomentowana wywoanie metody oblicz z argumentem typu short wywoa wlasnie ja
    //jesli pozostanie zakomentowana wywolana zostanie metoda z parametrem typu double
//    public void oblicz(int a) {
//        System.out.println("licze w metodzie przyjmujacej jeden parametr int");
//    }

    public void oblicz(int a, int b) {
        System.out.println("licze w metodzie przyjmujacej dwa parametry typu int: a i b");
    }

    public void oblicz(double a, double b) {
        System.out.println("licze w metodzie przyjmujacej dwa parametry typu double: a i b");

    }

    public Box oblicz(Box box112) {
        //box112 jest kopia przekazanej referencji, przypisanie do niej nowego obiektu
        //nie powoduje przypisania tego obiektu do referencji, ktora byla pzekazana jako argument
        box112 = new Box(box112.width + 10, box112.height + 10);

        return box112;
    }


    public static void main(String[] args) {
        Liczydlo licz = new Liczydlo();

        Box b0;

        Box b1 = new Box(2, 2);
        Box b2 = new Box(3, 3);

//        int resB1 = licz.oblicz(b1);
//        System.out.println("B1: Wysokosc + szderokosc = " + resB1);
//
//        int resB2 = licz.oblicz(b2);
//        System.out.println("B2: Wysokosc + szderokosc = " + resB2);

        //b1 nadal bedzie sie odnosic do obiektu stworzonego w linicje 37, b3 to referencja do obiektu zwroconego w metodzie oblicz
        Box b3 = licz.oblicz(b1);
        System.out.println("B1 height " + b1.height + ", width " + b1.width);
        System.out.println("B3 height " + b3.height + ", width " + b3.width);


        licz.oblicz(b2);

//        System.out.println("B2 height " + b2.height + ", width " + b2.width);

    }

}