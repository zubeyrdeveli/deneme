package day13_Strings;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();


        System.out.println("Enter your gender");
        String gender = input.next();


        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();


        System.out.println("Enter your phone number");
        long phoneNumber = input.nextLong();


        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();


        input.nextLine();

        System.out.println("Enter your School name");
        String schoolName = input.nextLine();


        System.out.println("Enter your city name");
        String cityName = input.nextLine();


        System.out.println("Enter your state name");
        String stateName = input.next();


        System.out.println("Enter your bulding number");
        int buildingNumber = input.nextInt();


        input.nextLine();

        System.out.println("Enter your Street name");
        String streetName = input.nextLine();



        System.out.println("1- Full Name = " + fullName);
        System.out.println("2- Age = " + age);
        System.out.println("3- Gender = " + gender);
        System.out.println("4- Phone Number = " + phoneNumber);
        System.out.println("5- Adress  =\n\t\t\t " + buildingNumber + ", " + streetName + ", \n\t\t\t " + cityName + ", " + stateName + ", " + zipCode);
        System.out.println("6- School Name = " + schoolName);

        input.close();





    }
}
