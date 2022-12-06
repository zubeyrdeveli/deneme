package day18_NestedLoop;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int number = -1;

        while (number != hiddenNumber) {
            System.out.println("Enter a number");
            number = input.nextInt();
            if (number > hiddenNumber) {
                System.out.println(number + " is high");
            } else if (number < hiddenNumber) {
                System.out.println(number + " is low");
            } else {
                System.out.println(number + " is correct");
            }
        }
    }
}
