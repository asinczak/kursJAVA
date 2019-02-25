package pl.com.ttpsc.kursJava.CarShowroom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Logging {

    public static String loginData;

    public static List<String> getLoginData ()  {

        List <String> dataList = new ArrayList<>();

        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("LogInData.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            while ((loginData = data.readLine()) != null){
                dataList.add(loginData);
            }

//                System.out.println(dataList.get(4));


        }catch (IOException e){
            e.printStackTrace();
        }
        return dataList ;
    }

    public static void main(String[] args) {

            getLoginData();

    }
}
