package pl.com.ttpsc.kursJava.wyklad_6;

import org.omg.CORBA.Object;

public class Money implements IMoney {

    double amountOfMoney;

    public Money (double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }


    public boolean equlas (Money obj) {
        if (this == obj)
        return true;
        if (obj == null)
        return false;
        if (getClass() != obj.getClass())
        return false;
//        Money other = (Money) obj;
//        if (Double.doubleToLongBits(amountOfMoney) != Double.doubleToLongBits(other.amountOfMoney))
//            return false;
        return true;
    }

    public static void main(String[] args) {

//        System.out.println(new Money(5).equlas(new Money(5)));
//        System.out.println(new Money(5).equlas(new Money(6)));

        System.out.println(new Dollar(5).equlas(new Franc(5)));

        Dollar dollar = new Dollar(11);
        System.out.println(dollar.getAmountOfMoney());
        dollar.add(new Dollar(5));
        System.out.println("suma dolarów: " + dollar.getAmountOfMoney());

        Franc franc = new Franc(7);
        System.out.println(franc.getAmountOfMoney());
        franc.add(new Franc(10));
        System.out.println("suma franków: " + franc.getAmountOfMoney());


        Dollar dollar4 = new Dollar(500);
        Franc franc3 = new Franc(200);
        dollar4.addWithExchange(franc3);
        System.out.println("Suma dolarów po wymianie funtów: " + dollar4.getAmountOfMoney());


        Franc franc4 = new Franc(150);
        Dollar dollar5 = new Dollar(300);
        franc4.addWithExchange(dollar5);
        System.out.println("Suma funtów po wymianie dolarów: " + franc4.getAmountOfMoney());
    }
}

