package pl.com.ttpsc.kursJava.Exercises;

public class Meds {

    private String[] nameOfMedicine = {"abacil", "agen", "clemastinum","zyrtex","mucofalk"};
    private double[] price = {20.90, 45.03, 11.20, 19.99, 70.35};
    private double[] refund = {0.2, 0.00, 0.5, 0.25, 0.1};


    public Meds() {
        for (int i = 0; i < nameOfMedicine.length; i++) {
            String name = nameOfMedicine[i];
            String CapitalName = name.substring(0,1).toUpperCase() + name.substring(1);
           nameOfMedicine [i] = CapitalName;
        }
    }

    public double price(String name, boolean insured) {

        double priceRefund = 0;
        for (int i = 0; i < nameOfMedicine.length; i++) {
            if (name.equals(nameOfMedicine[i])) {
                priceRefund = price[i];
                if (insured) {
                    priceRefund = priceRefund - (priceRefund * refund[i]);
                }
            }
        }
        return priceRefund;
    }

    public String maxRefund () {
        String name = "";
        double maxRefund = 0;
        double priceRefund [] = new double[refund.length];
        for(int i = 0; i<price.length; i++){
             priceRefund [i] = price [i] * this.refund [i];
            if (priceRefund [i] > maxRefund){
                maxRefund = priceRefund [i];
                name = nameOfMedicine [i];
            }
        } return name;
    }

    public double totalCost (boolean insured) {

        double totalCost = 0;
        for(int i = 0; i<nameOfMedicine.length; i++) {
        totalCost = totalCost + price(nameOfMedicine[i], insured);
        }
        return totalCost;
    }

    public void display () {
        for (int i =0; i < nameOfMedicine.length; i++){
            System.out.println("Name of medicine : "+nameOfMedicine[i]+", Price : "+price[i]+ ", Refund : "+refund[i]);
        }
    }

    public static void main(String[] args) {
        Meds meds = new Meds();

        System.out.println("Price for the medicine : " +meds.price("Zyrtex", false));
        System.out.println("Price for the medicine : " +meds.price("Zyrtex", true));

        System.out.println("Medicine wth the biggest refund : "+ meds.maxRefund());

        System.out.println("Total cost :" +meds.totalCost(true ));

        meds.display();

    }
}
