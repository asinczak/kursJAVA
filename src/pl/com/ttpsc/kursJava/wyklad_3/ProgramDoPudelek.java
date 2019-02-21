public class ProgramDoPudelek {
    public static void main(String[] args) {
        BoxDemo box = new BoxDemo ();
        box.depth = 10;
        box.height = 10;
        box.width = 10;

        System.out.println(box.volume);
        System.out.println(box.obliczObjetosc());
        System.out.println(box.polePowierzchni());
        System.out.println(box.typPudelka());
        System.out.println(box.dłPrzekatnej());

//        int volume = box.obliczObjetosc();
//        System.out.println(volume);

        BoxDemo box2 = new BoxDemo();
        box2.depth = 25;
        box2.height = 50;
        box2.width = 11;
        int szerokosc = 20;
        int wysokosc = 5;
        int glebokosc = 10;

        System.out.println(box2.obliczObjetosc());
        System.out.println("OBLICZAM OBJETOSC Z PARAMETRAMI" + box2.obliczObjetosc(10, 5, 10));
        System.out.println("OBLICZAM OBJETOSC Z PARAMETRAMI ze zmiennych" + box2.obliczObjetosc(szerokosc, wysokosc, glebokosc));
        System.out.println(box2.polePowierzchni());
        System.out.println(box2.typPudelka());
        System.out.println(box2.dłPrzekatnej());
    }
}
