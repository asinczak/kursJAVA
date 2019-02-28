package pl.com.ttpsc.kursJava.Piotrek.generics;

import pl.com.ttpsc.kursJava.Bank.BalanceExeption;
import pl.com.ttpsc.kursJava.Bank.CurrentAccount;

public class Gen<Z> {
    Z obj;

    public Gen(Z obj) {
        this.obj = obj;
    }

    public Z getObj() {
        return obj;
    }

    public static void main(String[] args) throws BalanceExeption {

        Gen<String> g1 = new Gen<>("ala ma kota");
        Gen<Integer> g2 = new Gen<>(1);
        Gen<CurrentAccount> g3 = new Gen<>(new CurrentAccount(1));

        Gen g4 = new Gen<>(new CurrentAccount(1));


        String obj = g1.getObj();

        CurrentAccount obj1 = g3.getObj();
        obj1.balanceDecrease(12);

        //nie ma typy podanego przy deklaracji, jedyne co mozna powiedziec to ze na pewno jest to Object
        Object obj2 = g4.getObj();

    }
}
