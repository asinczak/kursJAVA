package pl.com.ttpsc.kursJava.wyklad_8;

public class SalaryException extends Exception {

    public String getMessage () {
        return "Salary cannot be lower than minimum salary";
    }
}
