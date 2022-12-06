package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int [] numbers = {10, 0, 20, 30, 1, 99, 44, 55, 60};

     /*
        Arrays.sort(numbers);

        int maxNumber = numbers[numbers.length-1];

        System.out.println(maxNumber);

      */

        int maxNumber = numbers [0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>maxNumber) {

                maxNumber = numbers[i];
            }

        }

        System.out.println(maxNumber);

    }
}
