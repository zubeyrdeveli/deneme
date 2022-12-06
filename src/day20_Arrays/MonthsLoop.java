package day20_Arrays;

import java.util.Arrays;

public class MonthsLoop {
    public static void main(String[] args) {

        String [] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sep", "Oct", "Nov", "Dec"};

        for (int i = 0; i < 12; i++) {

            System.out.println(months[i]);
        }
        System.out.println("-----------------------------------------");

        for (int j = 11; j >= 0; j--) {

            System.out.println(months[j]);
        }

    }
}
