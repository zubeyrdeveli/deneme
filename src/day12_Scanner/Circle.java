package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius of the circle:");

        double rad = input.nextDouble();

        double area = rad*rad*3.14;
        double parameter = 2 * rad * 3.14;


        System.out.println("radius = " + rad);
        System.out.println("area = " + area);
        System.out.println("parameter = " + parameter);

        input.close();


    }
}
