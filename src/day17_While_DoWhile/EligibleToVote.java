package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while (!(age>=1 && age<=120)){
            System.err.println("Invalid entry, please re-enter your age: ");
            age=input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String citizen = input.next().toLowerCase();

        while ( !(citizen.equals("yes") || citizen.equals("no")) ){
            System.err.println("Invalid entry, re-enter your answer!");
            citizen = input.next().toLowerCase();
        }
        if (age>=18 && citizen.equals("yes")){
            System.out.println("You can vote!");
        } else {
            System.out.println("You're not eligible to vote.");
        }

    }
}
