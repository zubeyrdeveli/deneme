package day20_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number");
        int number = scan.nextInt();

        if (number<= 0 || number>12) {
            System.err.println("Invalid entry");
        } else {
            System.out.println(months[number-1]);
        }







    }
}
