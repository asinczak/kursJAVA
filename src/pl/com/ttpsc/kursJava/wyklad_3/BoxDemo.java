public class BoxDemo {

    int width;
    int height;
    int depth;
    int volume;



    int obliczObjetosc ( ) {
        volume = depth * height * width;
        return volume;
    }


    int obliczObjetosc (int szer, int wys, int gl ) {
        int objetosc = szer * wys * gl;
        return objetosc;
    }

    int polePowierzchni () {
      int  polePowierzchni = (4 *width * height) + (2* depth *width);
      return polePowierzchni;

    }
        //TODO zrobić dł przekątnej

    int dłPrzekatnej () {
        int wynik = (depth*depth) + (width*width) + (height*height);
        double dłPrzekatnej =  Math.sqrt(wynik);
        return (int) dłPrzekatnej;
    }

    String typPudelka () {
        if (width == height) {
            if (height == depth) {
                return "szescian";
            }

        }
        return "prostopadloscian";


    }


}
