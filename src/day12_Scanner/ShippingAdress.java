package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your State:");
        String state = scan.next();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country name:");
        String country = scan.nextLine();



        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        scan.close();




    }
}
