package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int [] numbers = {10,20,50,70};

        System.out.println (Arrays.toString(numbers));

        System.out.println("-----------------------------");

        int [] scores = new int[5];

        scores [0] = 65;
        scores [1] = 75;
        scores [2] = 85;
        scores [3] = 95;
        scores [scores.length-1] = 99;

        System.out.println(Arrays.toString(scores));


    }
}
