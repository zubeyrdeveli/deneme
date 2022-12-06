package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {

                System.err.println("Invalid entry, please re-enter your age");

            }

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){

                System.err.println("Invalid entry, would you like to continue?");
            }

            if (answer.equals("no")){

                break;
            }


        }

scan.close();

    }
}
