package day20_Arrays;

import java.util.Arrays;

public class replit {
    public static void main(String[] args) {


        int numbers [] = new int[8];
        double sum = 0;

        for (int i = 0; i < 8; i++) {

            sum += numbers[i];
        }

        double averageNumber = sum/8;

        System.out.println(averageNumber);

        System.out.println("-----------------------------");


        String sentence = "I am a Java programmer";

        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));



    }
}
