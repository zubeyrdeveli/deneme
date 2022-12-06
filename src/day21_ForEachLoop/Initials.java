package day21_ForEachLoop;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {

        String [] names = {"Elif Celik", "Ahmet Yilmaz", "Mehmet Yigit", "Zeki Olgu", "Ülkü Yeter", "Ceylan Sırkıntı",
                "Sevgi Dere", "Daniel Guiza"};


        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);

            System.out.println("initial = " + initial);
        }



    }
}
