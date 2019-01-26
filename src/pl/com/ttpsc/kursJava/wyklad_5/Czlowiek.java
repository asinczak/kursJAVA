package pl.com.ttpsc.kursJava.wyklad_5;

public class Czlowiek {

    int wiek;
    int wzrost;
    int waga;
    String plec;

    Czlowiek (int x, int y, int z, String str) {
        this.wiek = x;
        this.wzrost = y;
        this.waga = z;
        this.plec = str;
    }

    Czlowiek (int x, int y) {
        this.wiek = x;
        this.wzrost = y;
    }

    public void odchudz () {
        this.waga = this.waga -1;
    }

    public void rosnij () {
        this.wzrost = this.wzrost + 1;

    }

    public int czlowiekLiczy (int x, int y) {
        return x + y;
    }
}
