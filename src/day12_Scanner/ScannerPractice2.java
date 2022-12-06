package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter true/false:");
        boolean result = input.nextBoolean();

        System.out.println("result = " + result);

        System.out.println("Enter your full name: ");

        input.nextLine();

        String fullName = input.nextLine();

        System.out.println("fullName = " + fullName);

        input.close();





    }
}
