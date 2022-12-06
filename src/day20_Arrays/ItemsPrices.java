package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ItemsPrices {
    public static void main(String[] args) {

        String [] items = new String[5];
        double [] prices = new double[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter an item");
            items [i] = scan.next();

            System.out.println("Enter the price");
            prices [i] =scan.nextDouble();
        }


        System.out.println("items = " + Arrays.toString(items));
        System.out.println("prices = " + Arrays.toString(prices));

    }
}
