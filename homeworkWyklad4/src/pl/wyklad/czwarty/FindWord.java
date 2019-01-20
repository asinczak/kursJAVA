package pl.wyklad.czwarty;

public class FindWord {

    int findWorldInTab (String tab []) {

        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab [i].charAt(0) == tab [i].charAt(tab[i].length()-1)){
                result++;
            }
        }
        return  result;
   }


        int findWorldInString (String lettering) {
            int result = 0;
            String tab [] = lettering.split(" ");

            for (int i = 0; i < tab.length; i++) {
                if (tab [i].charAt(0) == tab [i].charAt(tab[i].length()-1)){
                    result++;
                }
            }

        return result;
        }
}
