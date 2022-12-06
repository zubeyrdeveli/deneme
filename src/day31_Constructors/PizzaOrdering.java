package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small=new Pizza('S',2,3);
            Pizza med=new Pizza('M',3,4);
            Pizza large=new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(small,med,large));

        }

        System.out.println("Total number of pizza : " + pizzas.size());

        double totalPrice =0;

        for (Pizza each : pizzas) {
            totalPrice+=each.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);

    }
}
