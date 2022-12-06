package day11_Scanner_intro;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first sentence");
        String sentence1 = input.nextLine();


        System.out.println("Enter your second sentence");
        String sentence2 = input.nextLine();

        System.out.println("sentence = " + sentence1);
        System.out.println("sentence2 = " + sentence2);


    }

}
