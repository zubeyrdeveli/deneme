package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {

        String [] myGroup = new String [5];

        myGroup [0]= "Gunay";
        myGroup [1] = "Ahmet";
        myGroup [2] = "Mehmet";
        myGroup [3] = "Hulya";
        myGroup [4] = "Ruya";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number of the day");
        int number = scan.nextInt();

        if (number<=0 || number>7){
            System.err.println("Invalid entry");
            System.exit(0);
        } else {
            System.out.println(days[number -1]);
        }

    }

}
