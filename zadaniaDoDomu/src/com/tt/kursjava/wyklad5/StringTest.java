package com.tt.kursjava.wyklad5;

import java.sql.SQLOutput;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "Ala ma kota";

        s1 = "Zosia ma lamparta";
        String podmieniony = s1.replace('a', 'b');

        System.out.println(s1);
        System.out.println(podmieniony);

        String s2 = new String("Maja tez ma kota");

        String s3 = "a";

        String substring = "abcdefghijk".substring(2);
        System.out.println(substring);


        System.out.println("abcdefghijk".substring(0, 4));

        String res = s1 + s2;
        System.out.println(res);
    }


}
