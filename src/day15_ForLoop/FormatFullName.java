package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = input.nextLine();

        System.out.println("Enter last name:");
        String lastName = input.nextLine();

        //firstName = ("" + firstName.charAt(0) ) .toUpperCase() + firstName.substring(1).toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.toUpperCase();

        System.out.println(firstName + " " + lastName);



    }
}
