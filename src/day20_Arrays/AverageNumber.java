package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int numberOfinput = scan.nextInt();

        int numbers [] = new int[numberOfinput];

        double sum = 0;

        for (int i = 0; i < numberOfinput; i++) {
            System.out.println("Enter a number: ");
            numbers[i]= scan.nextInt();

            sum += numbers[i];

        }

        double averageNumber = sum/numberOfinput; // sum/numbers.length;

        System.out.println("averageNumber = " + averageNumber);


    }
}
