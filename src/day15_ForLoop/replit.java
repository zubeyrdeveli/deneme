package day15_ForLoop;

import java.util.Scanner;

public class replit {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int day = 0;

        while(inhabitants != 0){

            System.out.println("Day " + day + " [" + inhabitants + "]");

            inhabitants /= 2;

            day++;
        }

        System.out.println("---- EXTINCT ----");

    }
}
