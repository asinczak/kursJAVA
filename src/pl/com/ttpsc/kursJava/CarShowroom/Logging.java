package pl.com.ttpsc.kursJava.CarShowroom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Logging {

    public static List<String> getLoginData ()  {

        String loginData;
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

        }catch (IOException e){
            e.printStackTrace();
        }
        return dataList ;
    }
}
