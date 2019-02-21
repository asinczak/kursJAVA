package pl.com.ttpsc.kursJava.wyklad_4;

public class FindWord {

    int findWordInTab (String tab []) {

        int result1 = 0;
        for (int i = 0; i < tab.length; i++) {
            String napis = tab [i];
            if (napis.charAt(0) == napis.charAt(napis.length()-1)){
                result1++;
            }
        }
        return  result1;
   }



        int findWordInString (String lettering) {

            String tab1 [] = lettering.split(" ");

        // odwołanie do poprzedniej metody findWordInTab
            int result2 = findWordInTab(tab1);


        // ten sam kod występuje w obu metodach:
//            int result = 0;
//            for (int i = 0; i < tab.length; i++) {
//                String napis = tab [i];
//                if (napis.charAt(0) == napis.charAt(napis.length()-1)){
//                    result++;
//                }
//            }

        return result2;
        }
}
