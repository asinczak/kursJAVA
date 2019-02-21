package pl.com.ttpsc.kursJava.wyklad_11;

public class Czlowiek {

    int wiek;
    int wzrost;
    int waga;
    char plec;

    public Czlowiek (int wiek, int wzrost, int waga, char plec) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.plec = plec;
    }

    public int getWiek () {
        return wiek;
    }

    public int getWzrost () {
        return wzrost;
    }

    public int getWaga () {
        return waga;
    }

    public char getPlec () {
        return plec;
    }

    public String toString () {
        return "" + "wiek : "+ getWiek() +" wzrost : " + getWiek()+" waga : "+getWaga() +"płeć : " + getPlec();
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Czlowiek)) {
            return false;
        }
            Czlowiek otherCzlowiek = (Czlowiek) obj;
            return wiek==otherCzlowiek.getWiek() & wzrost==otherCzlowiek.getWzrost() & plec==otherCzlowiek.getPlec();
    }

    @Override
    public int hashCode () {
        return 17 * wiek + 31 * wzrost + 7 * plec;
    }

}
