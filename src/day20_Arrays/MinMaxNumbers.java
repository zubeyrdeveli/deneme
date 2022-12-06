package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {

        int [] numbers = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers [i] = scan.nextInt();
        }


        int min = numbers [0];
        int max = numbers [0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers [i];
            }
        }

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
