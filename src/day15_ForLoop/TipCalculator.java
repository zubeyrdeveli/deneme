package day15_ForLoop;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = input.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next().toLowerCase();

        double tipRate = (serviceQuality.equals("excellent"))? 0.25 : (serviceQuality.equals("great"))? 0.20
                : (serviceQuality.equals("good"))? 0.15 : (serviceQuality.equals("fair"))? 0.10
                : 0.05;

        double totalTip = checkAmount * tipRate;

        System.out.println("yesOrNo = " + yesOrNo);
        System.out.println("numberOfPeople = " + numberOfPeople);
        System.out.println("checkAmount = " + checkAmount);
        System.out.println("Total Tip = " + totalTip);
        System.out.println("Genel Toplam= " + checkAmount+totalTip);


        if (yesOrNo.equals("yes") ) {
            System.out.println ("Total per person: "+ (checkAmount/numberOfPeople));
            System.out.println("Tip per person: " + (totalTip/numberOfPeople));
        }

        input.close();


    }
}
