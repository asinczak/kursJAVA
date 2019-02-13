package pl.com.ttpsc.kursJava.wyklad_8;

public class EmploymnetExeption extends Exception {

    public String getMessage () {
        return "The company cannot hire more than 6 employees";
    }
}
